import java.util.Scanner;
public class lcm {
     public static boolean prime(int n)
        {
            for(int i =2 ; i < n ; i++)
            {
                if(n%i == 0)
                return false;
                
            }
           return true; 
       }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(prime(a)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
    } 
}
