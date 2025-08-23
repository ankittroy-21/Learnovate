public class QuestionNum1 {
    public static void main(String[] args) {
       int num = 100;
       // Widening Casting (int to double)
       double d = num; // automatically converts int to double
       // Narrowing Casting (int to byte)
       byte b = (byte) num; // explicitly cast int to byte
       System.out.println("Integer: " + num);
       System.out.println("Double: " + d);
       System.out.println("Byte: " + b);
    }
}
