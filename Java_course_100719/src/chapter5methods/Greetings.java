package chapter5methods;

import java.util.Scanner;

public class Greetings {

    public static void main(String args[]){

      // ask user for their name:
        System.out.println("What is your name");
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.next();
        System.out.println("What is your last name");
        String lastname = scanner.next();
        greetUser(firstname);
        greetUseragain(lastname);
        System.out.println(lastname);


    }

    public static void greetUser(String name){
        System.out.println("Hi there "+ name);
    }

    public static String greetUseragain(String name){
        String lastnamegreeting = "Hi there "+ name;
        return(lastnamegreeting);
    }
}
