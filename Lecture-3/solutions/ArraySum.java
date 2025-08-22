public class ArraySum {

    /**
     * Calculates the sum of all elements in an integer array.
     * @param arr The array of integers (non-primitive).
     * @return The sum of the elements (primitive int).
     */
    public static int sumArray(int[] arr) {
        int sum = 0; // Primitive int to hold the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Accessing primitive values from the non-primitive array
        }
        return sum;
    }

    public static void main(String[] args) {
        // Non-primitive array of primitive integers
        int[] numbers = {10, 20, 30, 40, 50};
        int totalSum = sumArray(numbers);
        System.out.println("The sum of the array elements is: " + totalSum);
    }
}
