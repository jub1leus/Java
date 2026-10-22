package Week3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter grade (or type 'quit' to exit): ");
            String grade = scanner.next();
            grade = grade.toUpperCase();

            if (grade.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }
                switch (grade) {
                    case "A":
                        System.out.println("90-100");
                        break;
                    case "B":
                        System.out.println("80-89");
                        break;
                    case "C":
                        System.out.println("70-79");
                        break;
                    case "D":
                        System.out.println("60-69");
                        break;
                    case "E":
                        System.out.println("Less than 60 points.");
                        break;
                    default:
                        System.out.println("Invalid grade.");
                }
        }
        scanner.close();
    }
}
