public class QuestionNum2 {
    public static void main(String[] args) {
        // Marks in 3 subjects (out of 100 each)
        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 95;

        // Formula: CGPA = (sum of marks) / 30
        // Example: (85+90+95) / 30 = 9.0
        double cgpa = (subject1 + subject2 + subject3) / 30.0;

        // Print the CGPA
        System.out.println("The CGPA is: " + cgpa);
    }
}
