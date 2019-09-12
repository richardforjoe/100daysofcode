package chapter3ifswitch;

import java.util.Scanner;

public class GradeMessage {

    //Create main method
    public static void main(String args[]){

        // Initilise what we know
        String message;

        //Get wha we don't know
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String badmessage = scanner.next();

        //Make a decision - case - compares equality - does grade equal value? - If the nelse allows for a range
        switch(grade){
            case "A":  message = "Excellent Job";
                break;
            case "B": message = "Great Job";
                break;
            case "C": message = "Good Job";
                break;
            case "D": message = "You need to work a bit harder";
                break;
            case "F": message = "Ooops";
                break;
            default: message = "Error. Invalid grade";
                break;


        }

        if(message.equals(badmessage)) {
            System.out.println("You received a bad message");
        }
        else if(!message.equals(badmessage)){
            System.out.println("Good message");
            }
        else {
            System.out.println(message);
        }
            }
        }

