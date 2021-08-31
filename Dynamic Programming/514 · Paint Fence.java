public class Solution {
    /**
     * @param n: non-negative integer, n posts
     * @param k: non-negative integer, k colors
     * @return: an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        // write your code here
        int s=0,d=k;
        int t=s+d;
        for(int i=2;i<=n;i++)
        {
            s=d;
            d=t*(k-1);
            t=s+d;
        }
        return t;
    }
}