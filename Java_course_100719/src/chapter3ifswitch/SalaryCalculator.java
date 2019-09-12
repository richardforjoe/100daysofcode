package chapter3ifswitch;

//comment
/* Comment for multipline */

/* If statement. All sales people get a payment of $1000 a week
Sales people who exceed 10 sales get an additional bonus of $250
*/

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour - Decision on path
        if(sales >= quota) {
            System.out.println("Congrats! You've met your quota");
        salary = salary;
        }
        else{
        //Output
            salary = salary + bonus;
        System.out.println("The employee's pay is $" + salary);
        }}
    }

