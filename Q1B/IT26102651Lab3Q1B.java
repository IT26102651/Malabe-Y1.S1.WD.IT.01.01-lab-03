import java.util.Scanner;

public class IT26102651Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        // Calculate total price before discount
        double totalAmount = pricePerKg * quantity;

        // Apply 10% discount
        double discountedAmount = totalAmount * 0.90;

        // Display total amount with discount
        System.out.println("The total amount with 10% discount is: " + discountedAmount);

        
    }
}