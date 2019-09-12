package chapter6instantiating;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        // Rectangle 1

        //Create instance of Rectangle class
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is:" + area);
        calculator.scanner.close();
    }
        public Rectangle getRoom(){
          System.out.println("Enter the length of the room");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of the room");
            double width = scanner.nextDouble();

            //Rectangle room = new Rectangle(length,width);

            return new Rectangle(length, width);
        }
        public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
        }
}
