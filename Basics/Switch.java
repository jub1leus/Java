package Basics;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your day of the week: ");
        String day = input.nextLine();
        day = day.toUpperCase();
        try {
            switch (day){
                case "MONDAY":
                    System.out.println("Today is Monday. Your schedule is: Math, English, History");
                    break;
                case "TUESDAY":
                System.out.println("Today is Tuesday. Your schedule is: Science, Art, Music");
                break;
            case "WEDNESDAY":
                System.out.println("Today is Wednesday. Your schedule is: PE, Computer Science, Spanish");
                break;
            case "THURSDAY":
                System.out.println("Today is Thursday. Your schedule is: Math, English, History");
                break;
            case "FRIDAY":
                System.out.println("Today is Friday. Your schedule is: Science, Art, Music");
                break;
            default:
                System.out.println("Invalid day of the week. Please enter a valid day.");
            }
            input.close();
        } catch (Exception e) {
            System.out.println("That is not a valid day of the week. Please enter a valid day.");
        }
    }
    
}

//this is a switch statement example where you ask the user for the day and return their schedule
//the reason you my want to use a switch statement over a conditional is 
//because you have different, specific cases that you want to check for, rather than
//broad conditions or  true/false. 
// (the day isn't either monday or tuesday, but rather there's several options)
