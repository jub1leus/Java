package ProjectLib;

public class Textbook extends Book{
    private String course;

    public Textbook(String title, String author, double price, int stock, String course) {
        super(title, author, price, stock);
        this.course = course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayBookInfo(){
        super.displayBookInfo();
        System.out.println("Course: " + course);
    }

    public void sellBook(){
        System.out.println("Not for sale: "+ getTitle());
    }
}

