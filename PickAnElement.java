import java.util.*;
import java.io.*;
public class PickAnElement {
    public static void main(String args[])
    {
        int diff = 0 ;
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n ; i++)
    {
        a[i] = sc.nextInt();
    }
    for(int i = 0 ; i < n ;i++)
    {
        for(int j = i+1 ; j < i+2 ; j++)
        {
           diff = Math.abs(a[i] - a[j]);
           if(diff<=1)
           {
            al1.add(a[i]);
           }
           else
           {
            al2.add(a[i]);
           }
        }
    }
    int len1 = al1.size();
    int len2 = al2.size();
    System.out.println(len1>len2?len1:len2);

}
}
