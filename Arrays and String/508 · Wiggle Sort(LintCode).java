public class Solution {
    /*
     * @param nums: A list of integers
     * @return: nothing
     */
    public void wiggleSort(int[] nums) {
        // write your code here
        int p = 0;
        while (p<nums.length-1) {
           
            if(p%2==0)
            {
                if(nums[p]>nums[p+1])
                {
                  
                int temp = nums[p];
                nums[p] = nums[p+1];
                nums[p+1] = temp;
                }
            }
            else {
                if(nums[p]<nums[p+1])
                {
                   
                int temp = nums[p];
                nums[p] = nums[p+1];
                nums[p+1] = temp;
                }
            }

            p++;
        }
    }
}