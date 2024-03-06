import java.util.Arrays;
import java.util.Scanner;
public class longestsubArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] r = new int[n];
        int count = 0;
        int b = 0;
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n; j++)
            {
              int check = Math.abs(a[i]-a[j]);
              if(check<=1)
              {
                count++;
              }
            }
            r[b] = count;
            b++;
            count = 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i : r)
        {
           if(i>max)
           {
            max = i;
           }     
        }
        System.out.println(max+1);
    }
}
