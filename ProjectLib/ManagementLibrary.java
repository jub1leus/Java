package ProjectLib;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagementLibrary {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        Book b1 = new Book();
        b1.setTitle("Algorithms");
        b1.setAuthor("Anne Lee");
        b1.setPrice(30.0);
        b1.setStock(4);
        b1.setPublisher("Oak Press", "London");
        library.add(b1);

        Book b2 = new Book("Java Basics", "John Doe", 25.0, 10);
        b2.setPublisher("Penguin Books", "Paris");
        library.add(b2);
        Book b3 = new Book("Data Structures", "Maria Lopez", 40.0, 2);
        b3.setPublisher("Simon & Schuster", "Rome");
        library.add(b3);

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nHello! Welcome to the Leyendecker Library! Select what you want to do:");
                System.out.println("1) View book\n2) Take book\n3) Hand in a book\n4) Add a new book\n5) Exit");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice < 1 || choice > 5) {
                    System.out.println("That is not a recognized menu option.");
                    continue;
                }

                if (choice == 5) {
                    System.out.println("Goodbye!");
                    break;
                }

                switch (choice) {
                    case 1: // VIEW BOOK
                        if (library.isEmpty()) {
                            System.out.println("The library is currently empty.");
                            break;
                        }
                        System.out.println("Available Books:");
                        for (int i = 0; i < library.size(); i++) {
                            System.out.println((i + 1) + ") " + library.get(i).getTitle());
                        }
                        System.out.println("Which book number do you want to view?");
                        int bChoice = sc.nextInt();

                        if (bChoice >= 1 && bChoice <= library.size()) {
                            library.get(bChoice - 1).displayBookInfo();
                        } else {
                            System.out.println("Invalid selection.");
                        }
                        break;

                    case 2: // BORROW/TAKE BOOK
                        if (library.isEmpty()) {
                            System.out.println("No books available to borrow.");
                            break;
                        }
                        System.out.println("Which book number do you want to borrow? (1 to " + library.size() + ")");
                        int sel1 = sc.nextInt();
                        sc.nextLine();

                        if (sel1 >= 1 && sel1 <= library.size()) {
                            Book selectedBook = library.get(sel1 - 1);

                            System.out.println("Are you sure you want to borrow " + selectedBook.getTitle() + "? (y/n)");
                            String confirm = sc.nextLine();
                            if (confirm.equalsIgnoreCase("y")) {
                                selectedBook.sellBook(1);
                            } else {
                                System.out.println("Borrowing cancelled.");
                            }
                        } else {
                            System.out.println("Invalid selection.");
                        }
                        break;

                    case 3: // RETURN/HAND IN BOOK
                        if (library.isEmpty()) {
                            System.out.println("There are no books on file to return.");
                            break;
                        }
                        System.out.println("Which book number do you want to hand in? (1 to " + library.size() + ")");
                        int handBook = sc.nextInt();

                        if (handBook >= 1 && handBook <= library.size()) {
                            Book targetBook = library.get(handBook - 1);
                            targetBook.handInBook();
                            System.out.println("You've handed in a copy of " + targetBook.getTitle());
                        } else {
                            System.out.println("Invalid selection.");
                        }
                        break;

                    case 4: // ADD A NEW BOOK
                        System.out.println("Enter book title:");
                        String newTitle = sc.nextLine();

                        System.out.println("Enter book author:");
                        String newAuthor = sc.nextLine();

                        System.out.println("Enter book price ($):");
                        double newPrice = sc.nextDouble();

                        System.out.println("Enter starting stock quantity:");
                        int newStock = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter publisher name:");
                        String pubName = sc.nextLine();

                        System.out.println("Enter publisher city:");
                        String pubCity = sc.nextLine();

                        Book newBook = new Book(newTitle, newAuthor, newPrice, newStock);
                        newBook.setPublisher(pubName, pubCity);

                        library.add(newBook);
                        System.out.println("Successfully added '" + newTitle + "' to the library catalog!");
                        break;

                    default:
                        System.out.println("Invalid selection. Please try again.");
                        sc.nextLine();
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();
            }
            sc.nextLine();
        }
    }
}
