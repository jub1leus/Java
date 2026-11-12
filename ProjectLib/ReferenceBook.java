package ProjectLib;

public class ReferenceBook extends Book{
    private String shelf;


    public ReferenceBook(String title, String author, double price, String shelf) {
        super(title, author, price, 0);
        this.shelf = shelf;
    }


    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public void displayBookInfo(){
        super.displayBookInfo();
        System.out.println("Shelf: " + getShelf());
    }

    @Override
    public void sellBook(){
        System.out.println("Not for sale! "+getTitle());
    }

    @Override
    public void sellBook(int quantity){
        System.out.println("Not for sale!" +getTitle());
    }
}
