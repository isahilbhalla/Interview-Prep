
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        int start=0,end=1;
        while(end<size && start<size )
        {
            if(start!=end && arr[end]-arr[start]==n)
            {
                return true;
            }
            else if (arr[end]-arr[start]<n)
            {
                end++;
            }
            else 
            {
                start++;
                // end++;
            }
        }
        
        return false;
    }
}