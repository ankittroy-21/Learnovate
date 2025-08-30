public class QuestionNum8 {
    
    // Method to calculate Body Mass Index (BMI)
    // Takes weight in kg and height in meters, returns BMI value
    public static double calculateBMI(double weight, double height) {
        // Calculate BMI using formula: weight / (height * height)
        double bmi = weight / (height * height);
        return bmi;  // Return the calculated BMI
    }
    
    public static void main(String[] args) {
        double bmiResult = calculateBMI(68.5, 1.75);  // Calculate BMI
        System.out.println("BMI: " + bmiResult);
    }
}
