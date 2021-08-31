class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        boolean arr[] = new boolean[N+1];
        
        for(int i=2;i*i<=N;i++)
        {
            if(arr[i]==false)
            {
                int fp = 2;
                while(i*fp<=N)
                {
                    arr[i*fp] = true;
                    fp++;
                }
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=2;i<=N;i++)
        {
            if(arr[i]==false)
            {
                al.add(i);
            }
        }
        
        return al;
    }
}