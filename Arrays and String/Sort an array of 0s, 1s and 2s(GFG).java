// class Solution
// {
//     public static void sort012(int a[], int n)
//     {
//         // code here 
//       int start1=0,start2=0,unknown=0;
//         while(unknown<n)
//         {
//             if(a[unknown]==1)
//             {
//                 a[unknown] = a[start2];
//                 a[start2]  = 1;
//                 start2++;
//             }
//            else  if(a[unknown]==0)
//             {
//                 a[unknown] = a[start2];
//                 a[start2] = a[start1];
//                 start2++;
//                 a[start1] = 0;
//                 start1++;
//             }
//                 unknown++;
            
//         }
//     }
// }


class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
       int start1 = 0 , start2 = n-1 , unknown=0;
       while(unknown<=start2)
       {
           if(a[unknown]==2)
           {
               a[unknown]=a[start2];
               a[start2]=2;
               start2--;
           }
           else if (a[unknown]==0)
           {
               a[unknown]=1;
               a[start1]=0;
               start1++;
               unknown++;
           }
           else 
           {
              unknown++;
           
            }
            
        }
    }
}



