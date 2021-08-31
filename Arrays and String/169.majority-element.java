/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int val=nums[0] , occurrence = 1;
        for (int i = 1; i < nums.length; i++) {
            if(val==nums[i])
            {
                occurrence++;
            }
            else {
                if(occurrence==0)
                {
                    val = nums[i];
                    occurrence = 1;
                }
                else {
                    occurrence--;
                }
            }
        }
        return val;
    }
}
// @lc code=end

