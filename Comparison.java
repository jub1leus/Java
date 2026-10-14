import java.util.Scanner;

public class Comparison {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.printf("%d is greater than %d%n", num1, num2);
        } else if (num1 < num2){
            System.out.printf("%d is less than %d%n", num1, num2);
        } else {
            System.out.printf("%d is equal to %d%n", num1, num2);
        }
    }
    
}
