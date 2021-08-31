/*
 * @lc app=leetcode id=849 lang=java
 *
 * [849] Maximize Distance to Closest Person
 */

// @lc code=start
class Solution {
    public int maxDistToClosest(int[] seats) {
        int start = 0, end = 0;
        //max1
        if(seats[0]==0)
        {
            while(end < seats.length)
            {
                if(seats[end]==1)
                {
                    break;
                }
                end++;
            }
        }
        int max1 = end-start;
        start = end;
        //max2
        end++;
        int max2 = Integer.MIN_VALUE;
        while (end<seats.length) 
        {
            if(seats[end]==1)
            {
                int mid = (start+end)/2;
                max2 = Math.max(max2, mid-start);
                start = end;
            }

            end++;
        }
        if(start!=seats.length-1)
        {
            max2 = Math.max(max2,(seats.length-1)-start);
        }

        return Math.max(max1, max2);
        
        //max3
    }
}
// @lc code=end

