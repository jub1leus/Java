package Basics;

public class ForEachLoop {
    public static void main(String[] args){
        String[] students = {"John", "Jerry", "Mary"};

        for (String student : students){
            System.out.println("Name: "+student);
        }
    }
    
}

//the reason you may want to use a for each loop is because you want to iterate
//through a collection of items in an array or list