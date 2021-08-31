/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int [nums.length];
        int i=0,j=nums.length-1,k=nums.length-1;
        while (i<=j) {
            if(Math.abs(nums[i])<nums[j])
            {
                ans[k] = nums[j]*nums[j];
                j--;
            }
            else {
                ans[k] = nums[i]*nums[i];
                i++;
            }
            k--;
        }
        return ans;
    }
}
// @lc code=end

