public class QuestionNum10 {
    
    // Method 3 - Exception occurs here
    public static void method3() {
        System.out.println("In method3 - About to cause exception");
        int result = 10 / 0;  // ArithmeticException occurs here
    }
    
    // Method 2 - Calls method3, doesn't handle exception
    public static void method2() {
        System.out.println("In method2 - Calling method3");
        method3();  // Exception propagates from method3 to method2
    }
    
    // Method 1 - Calls method2, doesn't handle exception
    public static void method1() {
        System.out.println("In method1 - Calling method2");
        method2();  // Exception propagates from method2 to method1
    }
    
    public static void main(String[] args) {
        System.out.println("Exception Propagation Example:");
        
        try {
            method1();  // Exception propagates from method1 to main
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
            System.out.println("Stack Trace:");
            e.printStackTrace();
        }
    }
}
