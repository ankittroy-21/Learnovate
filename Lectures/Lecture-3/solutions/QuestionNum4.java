import java.util.Scanner;  // Import Scanner class for user input

public class QuestionNum4 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask the user for kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();  // Take input from user

        // Convert kilometers to miles (1 km = 0.621371 miles)
        double miles = kilometers * 0.621371;

        // Print result
        System.out.println(kilometers + " km is equal to " + miles + " miles.");

        // Close scanner
        sc.close();
    }
}
