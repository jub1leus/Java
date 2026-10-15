package Basics;

public class DoWhileLoop {
    public static void main(String[] args){
        int i = 0;
        do{
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }
    
}

//the reason you may want to use a do while loop is because you want 
//the loop to run at least once, EVEN IF IT IS FALSE, because the code block is executed 
//before the condition is checked. An example where you may want to use this is
//a text based game where you want a menu displayed at least once 
// without running other loops
