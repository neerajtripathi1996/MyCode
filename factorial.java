import java.util.Scanner;
public class factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int fact = 0;
        int n = sc.nextInt();
        while(n>0)
        {
            fact = n*(n-1);
        }
        System.out.println(fact);
    }
}
