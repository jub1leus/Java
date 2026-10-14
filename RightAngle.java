import java.util.Scanner;

public class RightAngle{
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int rows = in.nextInt();
            System.out.println("Here is your pattern.");

            for (int i = 1; i <= rows; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}