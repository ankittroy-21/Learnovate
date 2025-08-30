public class QuestionNum5 {
    
    // Method to calculate grade based on marks
    // Takes integer marks and returns character grade
    public static char calculateGrade(int marks) {
        // Check marks range and return appropriate grade
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks <= 89) {
            return 'B';
        } else if (marks >= 70 && marks <= 79) {
            return 'C';
        } else if (marks >= 60 && marks <= 69) {
            return 'D';
        } else {
            return 'F';  // For marks below 60
        }
    }
    
    public static void main(String[] args) {
        char grade = calculateGrade(85);  // Get grade for 85 marks
        System.out.println("Grade: " + grade);
    }
}
