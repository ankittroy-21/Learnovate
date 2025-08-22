class Demo {
    int defaultValue; // Instance variable → gets default value 0
}

public class VariableDemo5 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Default instance variable: " + obj.defaultValue);

        // Direct initialization
        int direct = 10;
        System.out.println("Direct initialization: " + direct);

        // Later initialization
        int later;
        later = 20;
        System.out.println("Later initialization: " + later);
    }
}
