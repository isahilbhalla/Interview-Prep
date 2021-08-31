import java.util.List;

/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val1 = nums[0], occurrence1 = 1 , val2 = nums[0] , occurrence2 = 0 ;

        for (int i = 1; i < nums.length; i++) {
            //diff
            if(val1!=nums[i] && val2!=nums[i])
            {
                if(occurrence1!=0 && occurrence2!=0)
                {
                    occurrence1--;
                    occurrence2--;
                }
                else if (occurrence1==0) {
                    val1 = nums[i];
                    occurrence1=1;
                }
                else {
                    val2 = nums[i];
                    occurrence2=1;
                }
            }
            //same
            else if(val1==nums[i]) {
                occurrence1++;
            }
            else {
                occurrence2++;
            }
        }
        List<Integer> l = new ArrayList<Integer>();
        int val1c=0,val2c=0;

        for (int i = 0; i < nums.length; i++) {
            if(val1==nums[i])
            {
                val1c++;
            }
            else if(val2==nums[i])
            {
                val2c++;
            }
        }

        if(val1c>nums.length/3)
        {
            l.add(val1);
        }

        if(val2c>nums.length/3)
        {
            l.add(val2);
        }

        return l;
    }
}
// @lc code=end

