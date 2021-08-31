/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int [nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] * nums[i];
        }
        int suffix = 1;
        for (int i = ans.length - 1; i > 0; i--) {
            ans[i] = ans[i - 1] * suffix;
            suffix *= nums[i];
        }
        ans[0] = suffix;
        return ans;
    }
}
// @lc code=end

