public class VariableDemo6 {
    public static void main(String[] args) {
        int x = 10; // variable in main scope
        System.out.println("x in main: " + x);

        if (true) {
            int y = 20; // variable inside if block
            int xInside = 30; // another variable named x but different scope
            System.out.println("x inside if block: " + xInside);
            System.out.println("y inside if block: " + y);
        }

        // System.out.println(y); // ❌ Error: cannot find symbol (y is not visible outside if)
    }
}
