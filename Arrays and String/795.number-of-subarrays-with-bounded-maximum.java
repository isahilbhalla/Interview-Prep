/*
 * @lc app=leetcode id=795 lang=java
 *
 * [795] Number of Subarrays with Bounded Maximum
 */

// @lc code=start
class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int ans = 0 , prev = 0 , start = 0 , end = 0;
        while (end < A.length) {
            if(A[end]<L)
            {
                ans+=prev;
            }
            else if(A[end]>R)
            {
                start= end+1;
                prev=0;
            }
            else {
                prev = end-start+1;
                ans+=prev;
            }
            end++;
        }
        return ans;
    }
}
// @lc code=end

