import java.util.Arrays;
import java.util.Scanner;
public class middlechar {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0 ; i < n ; i++)
        {
            str[i] = sc.next();
        }
        String midlleelement = getmiddle(str);
        if(midlleelement != null)
        {
            System.out.println("middleelement "+" "+midlleelement);
        }
        else
        {
            System.out.println("No middle element found");
        }
    }
    public static String getmiddle(String[] str)
    {
        for(String s : str)
        {
            String rev = new StringBuilder(s).reverse().toString();
            if(Arrays.asList(str).contains(rev))
            {
            int middleindex = (s.length())/2;
            return String.valueOf(s.charAt(middleindex));
    }
}
   return null;
}
}
