/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int odd = 0 , unknown = 0 ;
        while (unknown < A.length) {
            if(A[unknown]%2==0)
            {
                int todd = A[odd];
                A[odd]=A[unknown];
                A[unknown]= todd;
                odd++;
            }
            unknown++;
        }
        return A;
    }
}
// @lc code=end

