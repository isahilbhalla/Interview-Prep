/*
 * @lc app=leetcode id=925 lang=java
 *
 * [925] Long Pressed Name
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(typed.length()<name.length())
        {
            return false;
        }
   
        int tp = 0 , np =0;
   
        while (tp<typed.length() && np<name.length()) {
            char cn = name.charAt(np);
            char ct = typed.charAt(tp);
            if(cn==ct)
            {
                np++;
                tp++;
            }
            else if(tp!=0 &&ct==typed.charAt(tp-1))
            {
               tp++;
            }
            else 
            {
                return false;
            }
        }
           
        if(np<name.length())
        {
            return false;
        }
   
        while(tp<typed.length())
        {
            char ct = typed.charAt(tp);
            char prevct = typed.charAt(tp-1);
           if(ct==prevct)
           {
               tp++;
           }
           else {
               return false;
           }
        }
           
   
        return true;
       }
}
// @lc code=end

