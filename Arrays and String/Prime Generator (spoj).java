import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        while (test > 0) {
            int min = scn.nextInt();
            int max = scn.nextInt();
            boolean arr[] = new boolean[max - min + 1];
            ArrayList<Integer> prime = new ArrayList<>();
            //prime factors
            for (int i = 2; i*i <= max; i++) {
                int flag =0;
                for (int j = 2; j*j <=i; j++) {
                    if(i%j==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    prime.add(i);
                }
            }
            //starting index
            for (Integer p : prime) {
                int si;
                if(min%p==0)
                {
                    si=min/p;
                }
                else
                {
                    si = (min/p)+1;
                }
                if(si==1)
                {
                    si++;
                }
                while(p*si<=max)
                {
                    arr[(p*si)-min] = true;
                    si++;
                }
            }
            //print
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==false && i+min>1)
                {
                    System.out.println(i+min);
                }
            }
            System.out.println();
            test--;
        }
	}
}