public class CostCalculator {

    /**
     * Calculates the total cost of an item.
     * @param price The price of a single item (int).
     * @param quantity The number of items (int).
     * @return The total cost (int).
     */
    public static int calculateTotalCost(int price, int quantity) {
        // Primitives are used directly in the calculation
        return price * quantity;
    }

    public static void main(String[] args) {
        int itemPrice = 15;
        int itemQuantity = 5;
        int total = calculateTotalCost(itemPrice, itemQuantity);
        System.out.println("The total cost is: $" + total);
    }
}
