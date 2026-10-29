package ProjectLib;

import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public double price;
    public int stock;

    public Book(){
    }//default constructor

    public Book(String title, String author, double price, int stock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }


    public void displayBookInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
        System.out.println("Stock: " + this.stock + " units.");
        System.out.println("                ");
    }

    public void sellBook(int stock){
        for (int i = 0; i <stock; i++){
            this.stock--;
        }
        if (this.stock<0){
            System.out.println("Sorry, not enough copies of " + this.title + " to sell!");
        }
    }
}