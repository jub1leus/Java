package MethodsAndClasses;
public class Account {
    private String name; // instance variable

    public void setName(String name){ // set name
        this.name=name;
    }
    
    public String getName(){ // get name
        return name;
    }
}

//here we make a class called account, and we make a private variable
//called name, and we make a setter and getter
//setters are used to "set" the values and getters are used to "get" the values of the private variables.

//the reason you set and get the name is because the name is private 
// and you cannot access it directly from outside the class, because it is private. 
// So you need to use the set and get methods to access it.
//the reason you may want a private variable is because you want to 
// protect the data from being changed by other classes.
//data being changed by other classes means that other classes can access the variable and change its value, which may not be what you want. 
// for example, if you have a bank account class, you may not want other classes to be able to change the balance of the account directly, because that would be a security risk.