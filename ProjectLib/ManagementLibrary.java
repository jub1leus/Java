package ProjectLib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagementLibrary {
    static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Algorithms";
        b1.author = "Anne Lee";
        b1.price = 30.0;
        b1.stock = 4;

        Book b2 = new Book("Java Basics", "John Doe", 25.0, 10);
        Book b3 = new Book("Data Structures", "Maria Lopez", 40.0, 2);

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hello! Welcome to the Leyendecker Library! Select what you want to do:\n1)View book\n2)Take book\n3)Exit");
                int choice = sc.nextInt();

                if(choice < 1 || choice > 3){
                    System.out.println("That is not a recognized menu option.");
                }else
                switch (choice) {
                    case 1:
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Which book do you want to view?");
                        int bChoice = scanner.nextInt();
                        if (bChoice == 1) {
                            b1.displayBookInfo();
                        } else if (bChoice == 2) {
                            b2.displayBookInfo();
                        } else
                            b3.displayBookInfo();
                        break;

                    case 2:
                        Scanner sca = new Scanner(System.in);
                        System.out.println("Which book do you want to borrow?");
                        int sel1 = sca.nextInt();
                        sc.nextLine();
                        Book selectedBook = null;
                        if (sel1 == 1) {
                            selectedBook = b1;
                        } else if (sel1 == 2) {
                            selectedBook = b2;
                        } else if (sel1 == 3) {
                            selectedBook = b3;
                        }

                        if (selectedBook != null) {
                            System.out.println("Are you sure you want to borrow " + selectedBook.title + "? (y/n)");
                            String confirm = sc.nextLine();
                            if (confirm.equalsIgnoreCase("y")) {
                                selectedBook.sellBook(1);
                                System.out.println("You've borrowed the book " + selectedBook.title);
                            }else {
                                System.out.println("Borrowing cancelled.");
                            }
                        }else
                            System.out.println("Invalid book");
                    default:
                        System.out.println("Goodbye!");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid number.");
            }
            //b1.displayBookInfo();
            //b2.displayBookInfo();
            //b3.displayBookInfo();

            //b2.sellBook(1);
            //b2.displayBookInfo();

            //b2.sellBook(3);
            //b2.displayBookInfo();

            //b3.sellBook(5);

//            b3.sellBook(1);
//            b3.sellBook(1);
//            b3.displayBookInfo();
//            b3.sellBook(1);
        }
    }
}
