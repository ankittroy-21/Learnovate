public class QuestionNum2 {
    public static void main(String[] args) {
        int dayNumber = 3; // Predefined day number (1-7)
        
        // Switch statement to convert number to day name
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number"); // Handles numbers outside 1-7
        }
    }
}
