public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        // write your code here
        if(costs.length==0)
        {
            return 0;
        }
        int r= costs[0][0] , b = costs[0][1], g = costs[0][2];

        for (int i = 1; i < costs.length; i++) {
            int tr = costs[i][0] + Math.min(b,g);
            int tb = costs[i][1] + Math.min(r,g);
            int tg = costs[i][2] + Math.min(r,b);
            r=tr;
            b=tb;
            g=tg;
        }
        return Math.min(r,Math.min(b,g));
    }
}