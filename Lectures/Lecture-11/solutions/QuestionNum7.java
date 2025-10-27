// Custom Exception
class NegativeSalaryException extends Exception {
    public NegativeSalaryException(String message) {
        super(message);
    }
}

public class QuestionNum7 {
    // Method that throws custom exception
    public static void calculateTax(double salary) throws NegativeSalaryException {
        if (salary < 0) {
            throw new NegativeSalaryException("Salary cannot be negative: " + salary);
        } else {
            double tax = salary * 0.10;
            System.out.println("Tax for salary " + salary + " is: " + tax);
        }
    }
    
    public static void main(String[] args) {
        try {
            calculateTax(-5000);  // This will throw exception
        } catch (NegativeSalaryException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        try {
            calculateTax(50000);  // This will work
        } catch (NegativeSalaryException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
