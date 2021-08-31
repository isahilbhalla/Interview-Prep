/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int ma = 0 ;
        int start = 0, end = height.length-1;
        while (start < end) {
            int ans;
            if(height[start]>height[end])
            {
                ans = height[end]*(end-start);
                end--;
             
            }
            else 
            {
                ans = height[start]*(end-start);
                start++;
                
            }
            if(ans>ma)
                {
                    ma = ans;
                }
            
        }
        return ma;
    }
}
// @lc code=end

