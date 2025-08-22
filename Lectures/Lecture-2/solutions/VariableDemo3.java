public class VariableDemo3 {
    public static void main(String[] args) {
        int x;
        // System.out.println(x); // ❌ Compile-time Error: variable x might not have been initialized

        // Correct way: initialize before use
        x = 15;
        System.out.println("x = " + x);
    }
}
