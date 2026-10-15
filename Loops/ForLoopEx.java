package Loops;

public class ForLoopEx {

    public static void main(String[] args){
        for (int i = 0; i <= 10; i=i+2){
            System.out.print(i+ " ");
        }
    }}

    //in java loops, there are three parmeters to it:
    //1. the initialization/initial value of loop (here we start from 0)
    //2. the condition for the loop (the condition here is if i is smaller or equal to 10, 
    // so we only consider numbers in that range)
    //3. the increment/decrement of the loop (here we want only even numbers, so we increment by two)

    //the reason you may want to use a for loop is because you want to 
    // repeat a certain action a certain number of times, 
    // and you know how many times you want to repeat it.
    // knowing how many times you want it to repeat means you have your start, condition and finish clear