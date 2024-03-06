import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Arrayelementsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            numbers[i] = sc.nextInt();
        }
        String result = arrangeToFormBiggestNumber(numbers);
        System.out.println("The biggest number is: " + result);
    }

    public static String arrangeToFormBiggestNumber(int[] numbers) {
        String[] numStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrings[i] = String.valueOf(numbers[i]);
        }

         Arrays.sort(numStrings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String option1 = s1 + s2;
                String option2 = s2 + s1;
                return option2.compareTo(option1); 
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String numString : numStrings) {
            sb.append(numString);
        }

        return sb.toString();
    }
}
