import java.util.Scanner;  // Import Scanner class to take input

public class QuestionNum3 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user for their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Store user input

        // Print greeting message
        System.out.println("Hello " + name + ", have a good day!");

        // Close the scanner to free memory
        sc.close();
    }
}
