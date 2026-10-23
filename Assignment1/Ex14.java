package Assignment1;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nWhat's your word (type 'quit' to exit)? ");

                String text = sc.nextLine();
                text.toLowerCase();

                if (!text.matches("[a-zA-Z]+")){
                    System.out.println("Error: Please input letters only (no numbers or spaces).");
                    continue;
                }

                if (text.length()==0){
                    System.out.println("You haven't written anything!");
                }
                else if(text.matches("quit")){
                    System.out.println("Goodbye!");
                    break;
                }
                else {
                    StringBuilder sb = new StringBuilder(); //if it wasn't a loop exercise, sb reverse is best way to do it
                    for (int i = text.length() - 1; i >= 0; i--) {
                        char letter = text.charAt(i);
                        sb.append(letter);
                    }
                    System.out.println("Reversed word is: " + sb);
                }
            }sc.close();
        }
    }
