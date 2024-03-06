import java .util.Arrays; 
import java.util.Scanner;
public class Arraymaxmin {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0 ; i < n ; i++)
      {
        a[i] = sc.nextInt();
      }
      for(int i = 0 ; i < n ; i++ )
      {
        Arrays.sort(a);
      }
      int max = a[a.length-1];
      int min = a[0];
      System.out.println("("+max+","+min+")");
    }
    
}
