public class Solution {
    /**
     * @param grid: a 2D grid
     * @return: the minimize travel distance
     */
    public int minTotalDistance(int[][] grid) {
        // Write your code here
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        //x
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    x.add(i);
                }
            }
        }
        //y

        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 0; i < grid.length; i++) {
                if(grid[i][j]==1)
                {
                    y.add(j);
                }
            }
        }

        int mid = x.size()/2;
        int xindex = x.get(mid);
        int yindex = y.get(mid);

        int d=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1)
                {
                      d+= Math.abs(xindex-i) + Math.abs(yindex-j);
                }
            }
        }

        return d;
    }
}