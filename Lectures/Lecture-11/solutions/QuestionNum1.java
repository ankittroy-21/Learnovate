public class QuestionNum1 {
    public static void main(String[] args) {
        String s = null;
        
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Output: NullPointerException");
            System.out.println("Reason: Cannot invoke 'length()' on null object reference");
        }
    }
}
