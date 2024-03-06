import java.util.Scanner;
class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        for(int i = 0 ; i < r ; i++)
        {
               int temp = a[n-1];
                for(int k = n-1; k >0 ; k--)
                {
                    a[k] = a[k-1];
                }
                a[0] = temp;       
            for(int j = 0 ; j < n ;j++)
            {
                System.out.println(a[j]);
            }     
        }
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++)
        {
            int x = sc.nextInt();
            System.out.println(a[x]);
        }
    }
}
