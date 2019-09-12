package chapter2;

import java.util.Scanner;

public class CompleteSentence {
    public static void main(String arg[]){

        //1. Get the number of hours worked
        System.out.println("Give me a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Get the hourly pay rate
        System.out.println("Enter a whole number ");
        int number = scanner.nextInt();

        //3. Get the adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();


        //3. Display result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of cofee.");

    }

}
