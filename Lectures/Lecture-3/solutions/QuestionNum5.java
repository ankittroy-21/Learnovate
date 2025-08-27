import java.util.Scanner;  // Import Scanner class

public class QuestionNum5 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");

        // Check if input is an integer
        if (sc.hasNextInt()) {
            int number = sc.nextInt();  // Read the integer
            System.out.println("You entered an integer: " + number);
        } else {
            // If input is not an integer
            System.out.println("The entered value is not an integer.");
        }

        // Close scanner
        sc.close();
    }
}
