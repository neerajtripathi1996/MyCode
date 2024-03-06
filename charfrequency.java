public class charfrequency {
    public static void printCharacterFrequency(String str) {
        int length = str.length();

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            int count = 1; // Initialize count to 1 for the current character

            // Check the remaining characters for duplicates
            for (int j = i + 1; j < length; j++) {
                char nextChar = str.charAt(j);
                if (currentChar == nextChar) {
                    count++; // Increment count if a duplicate is found
                }
            }

            // Print the character and its frequency if it's not counted before
            if (count > 0) {
                System.out.println("'" + currentChar + "': " + count);
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Neearj";
        System.out.println("Character Frequencies in the string: " + inputString);
        printCharacterFrequency(inputString);
    }
}
