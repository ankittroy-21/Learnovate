public class QuestionNum2 {
    public static void main(String[] args) {
        System.out.println("Exception Types:");
        
        // Case 1
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("1. int a = 10/0; → ArithmeticException");
        }
        
        // Case 2
        try {
            int[] arr = new int[5]; 
            arr[10] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. arr[10] when size=5 → ArrayIndexOutOfBoundsException");
        }
        
        // Case 3
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("3. Integer.parseInt(\"abc\") → NumberFormatException");
        }
        
        // Case 4
        try {
            String str = null; 
            str.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("4. null.toUpperCase() → NullPointerException");
        }
    }
}
