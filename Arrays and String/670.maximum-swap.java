/*
 * @lc app=leetcode id=670 lang=java
 *
 * [670] Maximum Swap
 */

// @lc code=start
class Solution {
    public int maximumSwap(int num) {
        char numarr[] = Integer.toString(num).toCharArray();
        Integer lastoccurence[] = new Integer[10];
        
        for (int i = 0; i < numarr.length; i++) {
            lastoccurence[numarr[i]-'0'] = i;
        }
    
        for (int i = 0; i < numarr.length-1; i++) {
            for (int j = lastoccurence.length-1; j >numarr[i]-'0'; j--) {
                if(lastoccurence[j]!=null && lastoccurence[j]>i)
                {
                    int index = lastoccurence[j];
                    char temp = numarr[i];
                    numarr[i] = numarr[index];
                    numarr[index] = temp;
                    return Integer.valueOf(new String (numarr));
                }
            }
        }
        return num;
        }
}
// @lc code=end

 