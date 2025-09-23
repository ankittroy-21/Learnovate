public class QuestionNum3 {
    public static void main(String[] args) {
        String original = "Hello";
        
        System.out.println("Original string: " + original);
        original.concat(" World");
        System.out.println("After concat without reassignment: " + original);
        
        original = original.concat(" World");
        System.out.println("After reassignment: " + original);
    }
}
