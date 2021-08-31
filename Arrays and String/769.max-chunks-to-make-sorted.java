/*
 * @lc app=leetcode id=769 lang=java
 *
 * [769] Max Chunks To Make Sorted
 */

// @lc code=start
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = arr[0], chunks=0;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max, arr[i]);
            if(max==i)
            {
                chunks++;
            }
        }

        return chunks;
    }
}
// @lc code=end

