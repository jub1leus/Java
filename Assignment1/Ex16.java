package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex16 {

    public static double calculateTotal(double price, int quantity){
        return price * quantity;
    }

    static void printReceipt(String item, double price, int quantity, double total){
        System.out.println("Item: " + item);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nItem name (or type 0 to exit): ");

            try {
                String itemName = sc.nextLine();

                if (itemName.equals("0")){
                    System.out.println("Goodbye!");
                    break;
                }

                if (itemName.length() == 0 || !itemName.matches("[a-zA-Z]+")){
                    System.out.println("Error: Please input a valid item name.");
                    continue;
                }

                System.out.println("Price ($): ");
                double price = sc.nextDouble();

                System.out.println("Quantity: ");
                int quantity = sc.nextInt();

                sc.nextLine();

                double total = calculateTotal(price, quantity);
                printReceipt(itemName, price, quantity, total);

            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid numerical value.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
