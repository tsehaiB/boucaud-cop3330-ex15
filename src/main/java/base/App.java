/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    final static String password = "abc$123";
    public static void main(String[] args){
        App myApp = new App();
        String Pass = myApp.readPass();
        if(myApp.checkPass(Pass))
            System.out.println("Welcome!");
        else
            System.out.print("I don't know you.");
    }
    private String readPass(){
        System.out.print("What is the password? ");
        return inp.nextLine();
    }
    private boolean checkPass(String pass){
        if(pass.equals("abc$123"))
            return true;
        else
            return false;
    }
}
