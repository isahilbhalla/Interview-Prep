public class Solution {
    /**
     * @param costs: n x k cost matrix
     * @return: an integer, the minimum cost to paint all houses
     */
    public int minCostII(int[][] costs) {
        // write your code here
        if(costs.length==0)
        {
            return 0;
        }
        int n = costs.length;
        int k = costs[0].length;

        int dp[][] = new int[n][k];

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int h = 0; h < n; h++) {
            int cmin = Integer.MAX_VALUE;
            int csmin = Integer.MAX_VALUE;
            for (int c = 0; c < k; c++) {
                if(h==0)
                {
                    dp[h][c] = costs[h][c];
                   
                }
                else {
                   
                    if(dp[h-1][c]!=min)
                    {
                        dp[h][c] = costs[h][c]+min;
                        
                    }
                    else {
                        dp[h][c] = costs[h][c] + smin;
                       
                    }
                }
                if(dp[h][c]<cmin)
                {
                    csmin = cmin;
                    cmin = dp[h][c];
                }
                else if (dp[h][c]<csmin)
                {
                    csmin = dp[h][c];
                }
                
            }
            min = cmin;
            smin = csmin;
        }
        
        return min;
    }
}