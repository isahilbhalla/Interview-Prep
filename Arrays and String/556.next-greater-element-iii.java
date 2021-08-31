/*
 * @lc app=leetcode id=556 lang=java
 *
 * [556] Next Greater Element III
 */

// @lc code=start
class Solution {
    public int nextGreaterElement(int n) {
        StringBuilder str = new StringBuilder(Integer.toString(n));
        for (int i = str.length()-2; i>=0; i--) {
            if(str.charAt(i)<str.charAt(i+1))
            {
                //sort
                for (int j = 1; j <= (str.length()-(i+1))/2; j++) {
                    char prev = str.charAt(str.length()-j);
                    char ch = str.charAt(i+j);
                    str.setCharAt(str.length()-j,ch);
                    str.setCharAt(i+j,prev);
                }
                //replace
                for (int j = i+1; j < str.length(); j++) {
                    if(str.charAt(i)<str.charAt(j))
                    {
                        char prev = str.charAt(j);
                        char ch = str.charAt(i);
                        str.setCharAt(i,prev);
                        str.setCharAt(j, ch);
                        break;
                    }
                }
                try {
                    return Integer.parseInt(str.toString());
                } 
                catch (Exception e) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
// @lc code=end

