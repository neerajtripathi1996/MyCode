import java.util.Scanner;
public class Spalindrome {
 public boolean ispalindrome(String str)
 {
    String rev = ""; 
    for(int i = str.length()-1; i >= 0;i--)
    {
        rev = rev + str.charAt(i);
    }
    if(str.equalsIgnoreCase(rev))
    {
        return true;
    }
    return false;
 }     
 public static void main(String args[])
 {
    Spalindrome s = new Spalindrome();
  Scanner sc = new Scanner(System.in);
  String str = sc.next();
  System.out.println(s.ispalindrome(str)); 
 }
}
