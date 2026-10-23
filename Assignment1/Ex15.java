package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15 {

    public static void computeArea(float radius) {
        float area = 3.14159f * radius * radius;
        System.out.println("The area of the entered circle is: " + area + " square units.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of the circle or enter 0 to exit: ");

            try {
                float radius = scanner.nextFloat();

                if (radius == 0) {
                    System.out.println("Goodbye!");
                    break;
                } else{
                computeArea(radius);}
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        } scanner.close();
    }
}
