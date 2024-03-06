import java.util.Scanner;
class divisor
{
    public static void main(String args[])
    {  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = division(n);
        System.out.println(y);
    }
    public static int division(int n)
    { 
      int rem = 0;
      int count = 0;
      int x = n;
      while(x>0)
      {
        rem = x % 10;
        if(rem > 0)
        {
        if(n%rem == 0)
         count++;
        x = x/10; 
        }
        else
        {
         count = count+1;
         x = rem;
         break;
        }
    }
     return count;
}
}