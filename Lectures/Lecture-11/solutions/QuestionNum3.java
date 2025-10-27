// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class QuestionNum3 {
    // Method that throws custom exception
    public static void validateVoter(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is invalid. Minimum age required is 18.");
        } else {
            System.out.println("Age " + age + " is valid for voting.");
        }
    }
    
    public static void main(String[] args) {
        try {
            validateVoter(16);  // This will throw exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        try {
            validateVoter(20);  // This will work fine
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
