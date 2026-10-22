package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your number 0-1000 or type 1001 to exit: ");
            int sum=0;

            try {
                int num = sc.nextInt();
                if (num < 0 || num > 1001) {
                    System.out.println("This number is not in the range!");

                } else if (num==1001) {
                    System.out.println("Goodbye!");
                    break;

                } else {
                    while (num > 0) {
                        int dig = num%10;
                        sum+=dig;
                        num/=10;
                    }
                    System.out.println("The sum of the digits of your number is: "+sum);
                }

            } catch (InputMismatchException e) {
                System.out.println("That's not a valid input!");
                sc.next();
            }
        }
        sc.close();
    }
}
