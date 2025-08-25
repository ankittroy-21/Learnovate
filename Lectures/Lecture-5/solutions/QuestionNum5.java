public class QuestionNum5 {
    public static void main(String[] args) {
        int marks = 85;
        int attendance = 95;

        // Check for distinction
        boolean hasDistinction = (marks >= 80) && (attendance >= 90);

        // Output
        System.out.println("Passed with distinction: " + hasDistinction);
    }
}
