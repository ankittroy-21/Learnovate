import java.util.Scanner;
public class QuestionNum9 {
    public static void main(String[] args) {
     // Comment the lower code before proceeding this code
        int number = 30; // Number to check
        int i=1; // Temporary variable for processing
        
        // While loop to check even/odd using modulus
        while (i<=1) {
            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
            i++; // Exit after one check since we're checking a single number
        }
        // Comment the Above code before proceeding the below 
        // Alternative simpler approach for single number check but for multiple times
      Scanner sc = new Scanner(System.in);
      int num =30;
      while(num>=0){
        
        if (numb % 2 == 0) {
            System.out.println(num+ " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        System.out.println("Enter the next Number :");
        int num  = sc.nextInt();
      }
       System.out.println("While Loop Ended"); // Loop will be end when user put a negative number
    }
}
