import java.util.Scanner;
public class newArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

    }
    
}
