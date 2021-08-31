class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        
        int start1=0 , unknown=0;
        while(unknown<A.length)
        {
            if(A[unknown]==0)
            {
                //swap
                A[unknown]=1;
                A[start1]=0;
                start1++;
                
            }
            unknown++;
        }
        /**************
        * No need to print the array
        * ************/
    }
}