package ProjectLib;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;
    private Publisher publisherObj;

    private class Publisher {
        private String name;
        private String city;

        public Publisher(String name, String city){
            this.name = name;
            this.city = city;
        }

        @Override
        public String toString() {
            return name + " (" + city + ")";
        }
    }

    // Default constructor
    public Book(){
    }

    // Parametrized constructor
    public Book(String title, String author, double price, int stock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.publisherObj = null;
    }

    public void setPublisher(String name, String city) {
        if (name == null || city == null || name.trim().isEmpty() || city.trim().isEmpty()) {
            System.out.println("Publisher name and city cannot be empty.");
            this.publisherObj = new Publisher("Unknown Publisher", "Unknown City");
        } else {
            this.publisherObj = new Publisher(name, city);
        }
    }


    public void displayBookInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
        System.out.println("Stock: " + this.stock + " units.");
        if (publisherObj != null) {
            System.out.println("Publisher: " + publisherObj.toString());
        } else {
            System.out.println("Publisher: Not Set");
        }
        System.out.println("----------------");
    }

    public void sellBook(){
        sellBook(1);
    }

    public void sellBook(int quantity){
        if (this.stock - quantity < 0) {
            System.out.println("Sorry, not enough copies of '" + this.title + "' in stock to sell/borrow!");
        } else {
            this.stock -= quantity;
            System.out.println("Transaction approved. Remaining stock: " + this.stock);
        }
    }

    public void handInBook(){
        this.stock++;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price < 0){
            System.out.println("Price cannot be negative.");
        } else {
            this.price = price;
        }
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
