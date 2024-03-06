import java.util.Scanner;

public class SubstringPalindromeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String palindromeSubstring = findPalindromeSubstring(input);
        if(palindromeSubstring != null)
        {
        System.out.println(palindromeSubstring);
        System.out.println(palindromeSubstring.length());
        }
        else
        {
            System.out.println("No palindroe Substring is found");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static String findPalindromeSubstring(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                if (substring.length() > 1 && isPalindrome(substring)) {
                    return substring;
                }
            }
        }

        return null;
    }
}

