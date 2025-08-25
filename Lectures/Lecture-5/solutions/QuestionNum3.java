public class QuestionNum3 {
    public static void main(String[] args) {
        int stock = 500;
        System.out.println("Initial stock: " + stock);

        // Double the stock using a compound assignment operator
        stock *= 2;
        System.out.println("Stock after shipment: " + stock);

        // Decrease the stock after a sale
        stock -= 150;
        System.out.println("Final stock after sale: " + stock);
    }
}
