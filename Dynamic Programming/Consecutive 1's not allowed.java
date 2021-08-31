
class Solution {
    long countStrings(int n) {
        // code here
        long zero=1,one=1,total=zero+one;
        
        for(int i=1;i<n;i++)
        {
            one = zero;
            zero = total;
            total = one+zero;
        }
        return total;
    }
}