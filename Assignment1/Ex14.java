package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nWhat's your word (type 'quit' to exit)? ");

            try {
                String text = sc.nextLine();
                text.toLowerCase();

                if (text.length()==0){
                    System.out.println("You haven't written anything!");
                }
                else if(text.matches("quit")){
                    System.out.println("Goodbye!");
                    break;
                }
                else {
                    StringBuilder sb = new StringBuilder(); //if it wasn't a loop exercise, sb reverse is best way to do it
                    for(int i = text.length()-1; i>=0; i--){
                        char letter = text.charAt(i);
                        sb.append(letter);
                    }
                    System.out.println("Reversed word is: "+sb);
                }
            }catch (InputMismatchException e){
                System.out.println("You have to put in a word.");
                sc.next();
            }
        }

    }
}
