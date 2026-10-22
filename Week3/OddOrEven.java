package Week3;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter points: ");
        int grade = in.nextInt();

        if (grade >= 90) {
            System.out.println("Grade is A");
        } else if (grade >= 75) {
            System.out.println("Grade is B");
        } else if (grade >= 60) {
            System.out.println("Grade is C");
        } else
            System.out.println("Grade is D");

    }

}