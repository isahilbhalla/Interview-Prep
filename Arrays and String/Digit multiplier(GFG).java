class Solution {
    static String getSmallest(Long N) {
        // code here
      
        if(N==1)
        {
            return N+"";
        }
      
        String str = "";
        int div=9;
        while(N!=1 && div>=2)
        {
            if(N%div==0)
            {
                N=N/div;
                str = div+str;
            }
            else 
            {
                div--;
            }
        }
        
        if(N==1)
        {
            return str;
        }
        
        
        return -1+"";
    }
}