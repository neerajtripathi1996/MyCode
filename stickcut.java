import java.util.Arrays;
import java.util.Scanner;
public class stickcut {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
     int s = arr[0];
     int l = arr[n-1];
     while(l>s)
     {
     for(int i = 0 ; i < n ; i++)
     {
       if((s-i)>=0)
       {
         count++;
       }  
     }
    }
    }
}
