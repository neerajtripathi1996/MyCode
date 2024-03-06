import java.util.Scanner;
public class Prime {
    public boolean IsPrime(int x)
    {
        if(x == 1 || x == 2)
        {
            return true;
        }
        int count = 0;
        for(int i =2 ; i < x-1 ; i++)
        {
            if(x%i == 0)
            {
              count++; 
            }
        }
        if(count>0)
        {
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Prime p = new Prime();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(p.IsPrime(x));
    } 
}
