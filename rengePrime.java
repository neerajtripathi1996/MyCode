import java.util.Scanner;
public class rengePrime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < a.length-1 ; i++)
        {
            boolean isPrime = true;
            for(int j = 2 ; j < a[i] ; j++)
            {
                if(a[i] % j == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime)
            {
                System.out.println(a[i]+"is prime");
            }
           }
    }
}
