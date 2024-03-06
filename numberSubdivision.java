import java.util.*;
public class numberSubdivision {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> a1 = new ArrayList<>();
        while(n>0)
        {
            int rem = n%10;
            a1.add(0,rem);
            n = n/10;
        }
        System.out.println("The converted list is :");
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i) + " ");
        }
    }
}
