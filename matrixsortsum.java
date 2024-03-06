import java.util.Scanner;
import java.util.Arrays;
public class matrixsortsum {
    public static void main(String args[])
    {
        int sum = 0 , i=0 , j=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The row wise sorted matrix is");
        for(i=0;i<n;i++)
        {
            Arrays.sort(a[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i = 0 ; i < n ; i++)
        {
            for(j=0;j<n;j++)
            {
            if(j==0)
            {
                sum = sum+a[i][j];
            }
        }
       }
        System.out.println(sum);
}
}