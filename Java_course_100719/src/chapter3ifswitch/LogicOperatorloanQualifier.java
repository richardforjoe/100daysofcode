package chapter3ifswitch;

import java.util.Scanner;

/*
Logical operators:
To qualify for a loan, ap erson must make at least $40,000
and have been working at their current job for at least 2 years.
 */
public class LogicOperatorloanQualifier {

    //Create main method
    public static void main(String args[]){

        // Initilise what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
        //Get wha we don't know

        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();
        //Make a decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
                            System.out.println("Congrats! You qualify for the loan");
               }
        else {
            System.out.println("Sorry you must earn at least "
                    + "£" + requiredSalary);
        }
    }

}
