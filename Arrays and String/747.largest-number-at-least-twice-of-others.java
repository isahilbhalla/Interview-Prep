/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
            int max = Integer.MIN_VALUE , smax=0;
        int p = 0 , maxindex=0;
        while (p < nums.length) {
            if(nums[p]>max)
            {
                smax=max;
                max=nums[p];
                maxindex=p;
            }
            else if (nums[p]>smax)
            {
                smax=nums[p];
            }
            p++;
        }

        if(2*smax<=max)
        {
            return maxindex;
        }

        return -1;
    }
}
// @lc code=end

