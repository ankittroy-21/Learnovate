public class QuestionNum5 {
    public static void main(String[] args) {
        String str = "   Learn Java Programming   ";
        
        System.out.println("Original: '" + str + "'");
        String trimmed = str.trim();
        System.out.println("After trim: '" + trimmed + "'");
        System.out.println("Lowercase: " + trimmed.toLowerCase());
        System.out.println("Extract 'Java': " + trimmed.substring(6, 10));
        System.out.println("Starts with 'Learn': " + trimmed.startsWith("Learn"));
    }
}
