import java.util.Scanner;
public class friends {
    public static void main(String args[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j ++)
            {
               a[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("The matrix is");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(a[i][j] +" ");
            }
          System.out.println();
        }
        System.out.println("The number of enemies are :");
        for(int i = 0 ; i < n ; i++)
        {
            boolean isEnemy = false;
            for(int j = 0 ; j < n ; j++)
            {
                if(a[i][j] != 0)
                {
                    isEnemy = true;
                   count++;
                  // break;
                }
                // if(isEnemy == true)
                // {
                // count += 1;
                // }
            }
            
        }
        System.out.println(count);
    }
    
}
