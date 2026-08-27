package javaforbeg.com;

import java.util.Scanner;
// Custom exception class for item not found
class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}
public class GroceryShopping {
    // Search for an item in the items array and print its index position
    public static void searchItem(String[] items, String itemName) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(itemName)) {
                System.out.println("Found '" + items[i] + "' at index " + i);
                return;
            }
        }
        System.out.println("Item not found.");
    }
    // Calculate and return the average price of all items
    public static float calculateAveragePrice(float[] prices) {
        float total = 0.0f;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total / prices.length;
    }
    // Print the items priced below the given threshold
    public static void filterItemsBelowPrice(String[] items, float[] prices, float threshold) {
        System.out.println("Items below $" + threshold + ":");
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < threshold) {
                System.out.println("- " + items[i] + " ($" + prices[i] + ")");
            }
        }
    }
    public static void main(String[] args) {
        // Initialize arrays for items and prices
        String[] item = new String[20];
        float[] price = new float[20];
        int[] stock = new int[20]; // stock array for inventory management
        // Populate the arrays with sample data
        item[0] = "Sugar";       price[0] = 0.50f;  stock[0] = 20;
        item[1] = "Tea Pack";    price[1] = 0.30f;  stock[1] = 25;
        item[2] = "Bread";       price[2] = 2.00f;  stock[2] = 10;
        item[3] = "Milk";        price[3] = 1.50f;  stock[3] = 15;
        item[4] = "Eggs";        price[4] = 2.50f;  stock[4] = 12;
        item[5] = "Cheese";      price[5] = 3.00f;  stock[5] = 8;
        item[6] = "Chicken";     price[6] = 5.00f;  stock[6] = 6;
        item[7] = "Rice";        price[7] = 1.00f;  stock[7] = 18;
        item[8] = "Flour";       price[8] = 1.20f;  stock[8] = 14;
        item[9] = "Spaghetti";   price[9] = 0.80f;  stock[9] = 22;
        item[10] = "Cooking Oil"; price[10] = 4.50f; stock[10] = 10;
        item[11] = "Salt";        price[11] = 0.40f; stock[11] = 30;
        item[12] = "Biscuits";    price[12] = 1.00f; stock[12] = 20;
        item[13] = "Juice";       price[13] = 2.50f; stock[13] = 12;
        item[14] = "Yogurt";      price[14] = 1.80f; stock[14] = 15;
        item[15] = "Butter";      price[15] = 2.20f; stock[15] = 10;
        item[16] = "Mix Spices";      price[16] = 2.00f; stock[16] = 18;
        item[17] = "Black pepper";     price[17] = 1.50f; stock[17] = 20;
        item[18] = "Pasta";    price[18] = 1.30f; stock[18] = 25;
        item[19] = "sauces";    price[19] = 1.60f; stock[19] = 15;

        Scanner scanner = new Scanner(System.in);
        //Adding banner to represent
        System.out.println("========================================");
        System.out.println("       WELCOME TO THE GROCERY SHOP");
        System.out.println("========================================");

        // --- Test the required helper methods before shopping starts ---
        System.out.println("--- Testing searchItem() ---");
        searchItem(item, "Bread");
        searchItem(item, "Yogurt"); // not in the array, to show the "not found" case

        System.out.println("\n--- Testing calculateAveragePrice() ---");
        float avgPrice = calculateAveragePrice(price);
        System.out.println("Average price of all items: $" + avgPrice);

        System.out.println("\n--- Testing filterItemsBelowPrice() ---");
        filterItemsBelowPrice(item, price, 1.00f);
        filterItemsBelowPrice(item, price, 2.50f);
        System.out.println();

        // Outer infinite loop for multiple users
        while (true) {
            // Inner infinite loop for a single user's shopping
            float totalBill = 0.0f;
            while (true) {
                try {
                    System.out.println("Enter the name of the item (or type 'finish' to end shopping):");
                    String inputItem = scanner.nextLine();

                    // Check if the user wants to finish shopping
                    if (inputItem.equalsIgnoreCase("finish")) {

                        // Apply a 10% discount if the total bill exceeds $100
                        System.out.println("Your original total is: $" + totalBill);
                        if (totalBill > 50) {
                            float discountedTotal = totalBill * 0.90f;
                            System.out.println("You qualify for a 10% discount!");
                            System.out.println("Your discounted total is: $" + discountedTotal);
                        } else {
                            System.out.println("No discount applied.");
                        }

                        System.out.println("Thank you for shopping with us!");
                        break; // Exit the inner loop
                    }

                    // Find the index of the item in the array
                    int itemIndex = -1;
                    for (int i = 0; i < item.length; i++) {
                        if (item[i].equalsIgnoreCase(inputItem)) {
                            itemIndex = i;
                            break;
                        }
                    }

                    // If the item is not found, throw the custom exception
                    if (itemIndex == -1) {
                        throw new ItemNotFoundException("Item '" + inputItem + "' not found. Please try again.");
                    }

                    // Check inventory before asking for quantity
                    if (stock[itemIndex] == 0) {
                        System.out.println(item[itemIndex] + " is out of stock.");
                        continue;
                    }
                    // Ask for the quantity of the item
                    System.out.println("Enter the quantity of " + item[itemIndex] + ":");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (quantity <= 0) {
                        System.out.println("Quantity must be greater than zero. Please try again.");
                        continue;
                    }

                    // Check if there is enough stock for the requested quantity
                    if (quantity > stock[itemIndex]) {
                        System.out.println("Insufficient stock for " + item[itemIndex] +
                                ". Only " + stock[itemIndex] + " available.");
                        continue;
                    }

                    // Calculate the cost for the item and add it to the total bill
                    float itemCost = price[itemIndex] * quantity;
                    totalBill += itemCost;

                    // Reduce the stock after a successful purchase
                    stock[itemIndex] -= quantity;

                    System.out.println("Added " + quantity + " x " + item[itemIndex] + " to the bill. Current total: $" + totalBill);
                } catch (ItemNotFoundException e) {
                    System.out.println(e.getMessage()); // Print the exception message
                } catch (Exception e) {
                    System.out.println("Invalid input. Please try again.");
                    scanner.nextLine(); // Clear the invalid input
                }
            }
            String userInput = scanner.nextLine();
            // Exit the program if the user types "exit"
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the shopping cart. Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
