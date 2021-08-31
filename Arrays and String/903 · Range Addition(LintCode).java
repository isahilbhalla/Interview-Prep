public class Solution {
    /**
     * @param length: the length of the array
     * @param updates: update operations
     * @return: the modified array after all k operations were executed
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        // Write your code here
        int ans[] = new int [length];
        for (int i = 0; i < updates.length; i++) {
            int startindex = updates[i][0];
            int lastindex =  updates[i][1];
            int val = updates[i][2];
            ans[startindex] += val;
            if(lastindex+1<length) 
            {
                ans[lastindex+1] += (val*-1);
            }
        }

        for(int i=1;i<ans.length;i++)
        {
            ans[i] +=ans[i-1];
        }

        return ans;
    }
}