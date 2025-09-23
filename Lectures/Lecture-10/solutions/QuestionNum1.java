public class QuestionNum1 {
    public static void main(String[] args) {
        String str = "Hello World";
        
        System.out.println("Original string: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring 'World': " + str.substring(6));
        System.out.println("Contains 'Java': " + str.contains("Java"));
    }
}
