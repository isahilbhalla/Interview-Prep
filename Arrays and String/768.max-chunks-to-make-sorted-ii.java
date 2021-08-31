/*
 * @lc app=leetcode id=768 lang=java
 *
 * [768] Max Chunks To Make Sorted II
 */

// @lc code=start
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int rightmin[] = new int[arr.length];
        rightmin[arr.length-1] =  arr[arr.length-1];
        int max = 0  , chunks=1;

        for (int i = rightmin.length-2; i >=0; i--) {
            rightmin[i] = Math.min(arr[i], rightmin[i+1]);
        }

        for (int i = 0; i < rightmin.length-1; i++) {
            max = Math.max(max,arr[i]);
            if(max<=rightmin[i+1])
            {
                chunks++;
            }
        }
        return chunks;
    }
}
// @lc code=end

