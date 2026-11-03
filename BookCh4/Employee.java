package BookCh4;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay; //data encapsulation

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);

//        if (n==null){
//            System.out.println("Name cannot be null");
//        }else
//            System.out.println("Name is valid");
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
//    LocalDate rightNow = null;
//    String s= rightNow.toString(); //null pointer exception
}
