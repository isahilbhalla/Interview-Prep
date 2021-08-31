/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char ans []= s.toCharArray();
        int start = 0 , end = s.length()-1;
  
        while (start < end) {
  
            while (start<end) {
              if(ans[start]=='a' || ans[start]=='e' || ans[start]=='i' || ans[start]=='o' || ans[start]=='u' || ans[start]=='A' || ans[start]=='E' || ans[start]=='I' || ans[start]=='O' || ans[start]=='U')
              {
                  break;
              }
              start++;
            }
  
            while (start < end) {
              if(ans[end]=='a' || ans[end]=='e' || ans[end]=='i' || ans[end]=='o' || ans[end]=='u' || ans[end]=='A' || ans[end]=='E' || ans[end]=='I' || ans[end]=='O' || ans[end]=='U')
                  {
                      break;
                  }
              end--;
            }
  
             if(start<end) {
              char swapper = ans[start];
              ans[start] = ans[end];
              ans[end] = swapper;
              start++;
              end--;
            }
        }
  
        return new String (ans);
    }
}
// @lc code=end

