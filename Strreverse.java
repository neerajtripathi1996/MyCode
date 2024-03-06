import java.util.Scanner; 
public class Strreverse {
    public static String reverse(String str){  
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        return rev;  
    }  
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      Strreverse s = new Strreverse();
      String str = sc.nextLine();
      String ans =s.reverse(str);
      System.out.println(ans);
    }
    
}
