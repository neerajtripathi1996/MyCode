import java.util.Scanner;

public class targetpair {
    public static void insert(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static int count(int[] arr, int target) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    num++;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        insert(arr);
        int counts  = count(arr, 9);

        System.out.println("count = " + counts);
        sc.close();
    }

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int t = sc.nextInt();
    // int[] a = new int[n];
    // int count =0;
    // for(int i = 0 ; i < n ; i++)
    // {
    // count = 0;
    // r(int j =
    // {
    // if(a[i]+a[j] == t)
    // {
    // count++;
    //
    //
    //
    // System.out.println(count);
    // sc.close();
}
