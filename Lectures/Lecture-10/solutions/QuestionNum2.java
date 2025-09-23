public class QuestionNum2 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programming";
        
        System.out.println("Using + operator: " + (str1 + str2));
        System.out.println("Using concat(): " + str1.concat(str2));
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals ignore case: " + str1.equalsIgnoreCase(str2));
        System.out.println("Replace 'a' with 'o': " + str1.replace('a', 'o'));
    }
}
