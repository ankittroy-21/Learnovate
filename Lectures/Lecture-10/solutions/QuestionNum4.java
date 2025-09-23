public class QuestionNum4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Step 1 - Initial: " + sb);
        
        sb.append(" is fun");
        System.out.println("Step 2 - After append: " + sb);
        
        sb.insert(0, "Programming ");
        System.out.println("Step 3 - After insert: " + sb);
        
        sb.reverse();
        System.out.println("Step 4 - After reverse: " + sb);
    }
}
