import java.util.Stack;

public class QuestionNum7 {
    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 10, 8};
        int[] arr2 = {3, 2, 1, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};
        
        int[][] testArrays = {arr1, arr2, arr3, arr4};
        
        for (int[] arr : testArrays) {
            System.out.print("Array: ");
            for (int num : arr) System.out.print(num + " ");
            
            int[] result = nextGreaterElement(arr);
            
            System.out.print("\nNGE:   ");
            for (int num : result) System.out.print(num + " ");
            System.out.println("\n");
        }
    }
}
