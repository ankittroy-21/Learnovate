public class QuestionNum7 {
    public static void main(String[] args) {
        // Inefficient way - String concatenation in loop
        String result1 = "";
        for (int i = 0; i < 5; i++) {
            result1 += "Java "; // Creates new object each time
        }
        System.out.println("String concatenation result: " + result1);
        
        // Efficient way - StringBuilder in loop
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("Java "); // Modifies same object
        }
        System.out.println("StringBuilder result: " + sb.toString());
    }
}
