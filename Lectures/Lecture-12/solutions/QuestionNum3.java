import java.util.Stack;

public class QuestionNum3 {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;
    
    public QuestionNum3() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = "homepage";
    }
    
    public void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + url);
    }
    
    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("Cannot go back! No history available.");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("Back to: " + currentPage);
    }
    
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Cannot go forward! No forward history.");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Forward to: " + currentPage);
    }
    
    public void displayCurrent() {
        System.out.println("Current Page: " + currentPage);
    }
    
    public static void main(String[] args) {
        QuestionNum3 browser = new QuestionNum3();
        
        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");
        
        browser.displayCurrent();
        browser.back();
        browser.back();
        browser.forward();
        browser.visit("leetcode.com");
        browser.forward(); // Should show error
        browser.displayCurrent();
    }
}
