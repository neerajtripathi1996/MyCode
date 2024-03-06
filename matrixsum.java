import java.util.Arrays;
//import java.util.Scanner;
class matrixsum
{
    public static void main(String args[])
    {
        // int sum = 0 ;
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[][] a = new int[n][n];
        // for(int i = 0 ; i < n ; i++)
        // {
        //     for(int j = 0 ; j < n ; j++)
        //     {
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("The matrix  is : ");
        // for(int i = 0 ; i < n ; i++)
        // {
        //     for(int j = 0 ; j < n ; j++)
        //     {
        //         System.out.print(a[i][j]+" ");
        //     }
        //  System.out.print("\n");
        // }
        // System.out.println("The row wise sum of matrix is :");
        // for(int i = 0 ; i < n ; i++)
        // {
        //     sum = 0;
        //     for(int j = 0 ; j < n ; j++)
        //     {
        //         sum = sum +a[i][j];
        //     }
        //     System.out.println(sum);
        // }
        // System.out.println("The colloum wise sum is :");
        // for(int i = 0 ; i < n ; i++)
        // { 
        //     sum = 0;
        //     for(int j = 0 ; j < n ; j++)
        //     {
        //         sum = sum + a[j][i];
        //     }
        //     System.out.println(sum);
        // }
        int[][] a = {{3,2,1},{6,5,7}};
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = 0 ; j < a[i].length-1 ; j++)
            {
              
                  if(a[i][j]>a[i][j+1])
                  {
                    int temp = a[i][j];
                    a[i][j] = a[i][j+1];
                    a[i][j+1] = temp;  
                  }
             }
        }
        
            System.out.println("The sorted  matrix is : ");
            for(int i = 0 ; i < a.length ; i++)
           {
            for(int j = 0 ; j < a[0].length ; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
           }
           //sc.close();
        }
    }