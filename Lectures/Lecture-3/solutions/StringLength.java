public class StringLength {

    /**
     * Returns the length of a given string.
     * @param text The input string (non-primitive).
     * @return The length of the string (primitive int).
     */
    public static int getStringLength(String text) {
        // Calling the .length() method on the non-primitive String object
        return text.length();
    }

    public static void main(String[] args) {
        String myText = "Hello, World!";
        int length = getStringLength(myText);
        System.out.println("The length of the string is: " + length);
    }
}
