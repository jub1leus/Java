package Basics;

import java.util.Scanner;

public class Conditionals {

     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Is it raining? ");
        String rain = in.nextLine();
        rain = rain.toLowerCase();

        if(rain == "yes"){
            System.out.println("Take an umbrella with you!");
        }
        else{
            System.out.println("Wear your lighter clothes!");
        }

    }

}
