public class sequence {

    public static int findSequenceChangeIndex(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return -1; // Array follows only one sequence
        }

        int prevDiff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            int currentDiff = arr[i] - arr[i - 1];
            if (currentDiff != prevDiff) {
                return i - 1; // Index at which sequence changes
            }
        }

        return -1; // Array follows only one sequence
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 5, 7, 8, 10, 12 };
        int[] arr2 = { 1, 3, 5, 7, 9, 11, 13 };
        
        int index1 = findSequenceChangeIndex(arr1);
        int index2 = findSequenceChangeIndex(arr2);
        
        System.out.println("Index of sequence change in arr1: " + index1);
        System.out.println("Index of sequence change in arr2: " + index2);
    }
}
