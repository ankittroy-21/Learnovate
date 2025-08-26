import java.util.Scanner;

public class QuestionNum5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        // Do-while loop to ensure at least one execution
        do {
            System.out.print("Enter a number greater than 100: ");
            number = scanner.nextInt();
        } while (number <= 100); // Continue until number > 100
        
        System.out.println("Thank you! You entered: " + number);
        scanner.close();
    }
}
