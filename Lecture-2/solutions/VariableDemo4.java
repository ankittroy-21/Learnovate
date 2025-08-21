public class VariableDemo4 {
    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        System.out.println("MAX_VALUE = " + MAX_VALUE);

        // MAX_VALUE = 200; // ❌ Error: cannot assign a value to final variable
    }
}
