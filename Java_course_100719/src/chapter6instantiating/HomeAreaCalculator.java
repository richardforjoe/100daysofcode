package chapter6instantiating;

public class HomeAreaCalculator {

    public static void main(String args[]){
        // Rectangle 1

        //Create instance of Rectangle class

        Rectangle room1 = new Rectangle(); // calling the default
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        //Rectangle 2
        Rectangle room2 = new Rectangle(30,100);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms:" + totalArea);
    }
}
