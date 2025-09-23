public class QuestionNum6 {
    public static void main(String[] args) {
        String str = "Programming";
        
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Index of first 'g': " + str.indexOf('g'));
        System.out.println("Case-sensitive comparison: " + "Java".equals("JAVA"));
        System.out.println("Case-insensitive comparison: " + "Java".equalsIgnoreCase("JAVA"));
    }
}
