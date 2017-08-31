//Author: Joe Ezaki
//ALS 54A
//3.6.17

//This program will help us practice using a Scanner

import java.util.Scanner; //get access to the Scanner class

public class Practice
{
    public static void main (String[] arg)
    {
        Scanner console = new Scanner(System.in);
        welcome(console);
        String foo="";
        getAge(foo, console);
        
    }
    
    public static String welcome(Scanner kb)
    {
        System.out.println("Hello, World!");
        System.out.print("What's your name? ");
        String name = kb.next();
        return name;
    }
    
    public static void getAge(String bar, Scanner reader)
    {
        System.out.print("\n\nOk " + bar + ". Tell me your age\nand I'll tell you something: ");
        int age = (int)reader.nextDouble();
        System.out.print("Hmm...in 4 years you'll be " + (age+4) + " years old!"); 
    }
}


//This is just to see what happens
