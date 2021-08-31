/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int p=0;
        while (p<length) {
            if(nums[p]!=p+1 && nums[p]>=1 && nums[p]<=length && nums[p]!=nums[nums[p]-1])
            {
                int index = nums[p]-1;
                int temp = nums[index];
                nums[index] = nums[p];
                nums[p] = temp;
               
            }
            else
            {
                p++;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return length+1;
    
    }
}
// @lc code=end

