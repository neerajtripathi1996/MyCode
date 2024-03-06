import java.util.Scanner;
public class pivotIndex {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0 ; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n; i++)
        {
            sum =sum+a[i];
        } 
        int lsum = 0;
        int rsum = sum;
        for(int i = 0 ; i < a.length;i++)
        {
            rsum = sum - a[i];
            if(lsum == rsum)
            {
                System.out.println(i-1);
                break;
            }
            lsum = lsum+a[i];
        }
    }
}
