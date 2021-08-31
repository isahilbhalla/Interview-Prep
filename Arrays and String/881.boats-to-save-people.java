import java.util.Arrays;

/*
 * @lc app=leetcode id=881 lang=java
 *
 * [881] Boats to Save People
 */

// @lc code=start
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0 , end = people.length-1, boats=0;

        while (start < end) {
            if(people[start]+people[end] <= limit)
            {
                boats++;
                start++;
                end--;
            }
            else if (people[start]+people[end]> limit)
            {
                boats++;
                end--;
            }
        }

        if(start==end)
        {
            boats++;
        }
        return boats;
    }
}
// @lc code=end

