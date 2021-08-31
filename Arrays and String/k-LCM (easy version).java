import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();

        while (test > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();

            if(n%2!=0)
            {
                System.out.println(n/2+" "+n/2+" "+1);
            }
            else 
            {
                if((n/2)%2==0)
                {
                    System.out.println(n/2+" "+n/4+" "+n/4);
                }
                else 
                {
                    System.out.println((n-2)/2+" "+(n-2)/2+" "+2);
                }
            }

            test--;
        }
    }
}