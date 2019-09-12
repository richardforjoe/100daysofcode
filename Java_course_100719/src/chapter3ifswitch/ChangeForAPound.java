package chapter3ifswitch;

import java.util.Scanner;

public class ChangeForAPound {

    //Create main method
    public static void main(String args[]){

        // Initilise what we know
        double winningAmount = 1;
        double penniesrate = 0.01;
        double nickelsrate = 0.05;
        double dimesrate = 0.1;
        double quatersrate = 0.25;


        //Get wha we don't know
        System.out.println("Enter the following values for a chance to win");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies?");
        double pennies = scanner.nextDouble();
        System.out.println("How many nickels?");
        double nickels = scanner.nextDouble();
        System.out.println("How many dimes?");
        double dimes = scanner.nextDouble();
        System.out.println("How many quaters?");
        double quaters = scanner.nextDouble();
        //Make a decision

        double total = (pennies * penniesrate) + (nickels * nickelsrate) + (dimes * dimesrate) + (quaters * quatersrate);

        if(total == winningAmount) {
            System.out.println("You Win");
        }
        else {
            double lossamount = total - winningAmount;
            System.out.println("You were out by" + "$" + lossamount);
        }
    }
}
