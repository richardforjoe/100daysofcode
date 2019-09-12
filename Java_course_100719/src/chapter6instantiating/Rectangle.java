package chapter6instantiating;


public class Rectangle {

    //characteristics - Fields

    private double length;
    private double width;

    // Constructors - These are used to set a state for an object. Default constructor does not have a value. Used to assign default values to the field
    public Rectangle(){ //Sets the default values if nothing is passed
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){ // allows a value to be passed
        this.length = length; //can be done this way
        setWidth(width); //call the method to set the value
    }
    //provide getters and setters for the fields
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        //the the variable that refers to this class and store the local variable in there
        this.length = length;
    }

    //provide getters and setters for the fields - These allows the values to be set from within the class
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        //the the variable that refers to this class and store the local variable in there
        this.width = width;
    }
    public double calculatePerimeter(){
    return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
