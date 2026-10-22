package Week3;

import java.util.Scanner;

public class NumStat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int totalSum = 0;

        System.out.print("Enter integers (enter 0 to end inputs): ");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            totalSum += number;
        }

        int totalCount = positiveCount + negativeCount;

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Total numbers entered: " + totalCount);

        if (totalCount > 0) {
            double average = (double) totalSum / totalCount;
            System.out.println("Average of all nonzero numbers: " + average);
        } else {
            System.out.println("No nonzero numbers were entered.");
        }

        scanner.close();
    }
}
