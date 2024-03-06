
import java.util.Scanner;
public class palindrome {
    public boolean palindrome(int x)
    {
        int a = x;
        int rev = 0;
        while(a>0)
        {
            int rem = a%10;
            rev = rev*10 + rem;
            a = a/10;
        }
        if(x == rev)
        {
          return true;
        }
        return false;
    }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            palindrome p = new palindrome();
            int x = sc.nextInt();
            System.out.println(p.palindrome(x));
            sc.close();
        }
    }

