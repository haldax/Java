/*
(The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains:
■■ The data fields x and y that represent the coordinates with getter methods.
■■ A no-arg constructor that creates a point (0, 0).
■■ A constructor that constructs a point with specified coordinates.
■■ A method named distance that returns the distance from this point to a specified point of the MyPoint type.
■■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
■■ A static method named distance that returns the distance from two MyPoint objects.
Draw the UML diagram for the class then implement the class. Write a test
program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them.
*/
public class E1004 {
    public static void main(String[] args) {
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(4, 0);
        System.out.println("Distance between two points is " + MyPoint.distance(a,b));
    }
}

class MyPoint{
    //data fields
    private double x;
    private double y;

    //Constructor
    public MyPoint(){
        this(0,0);
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Methods
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(double a, double b) {
        return Math.pow(((a - x)* (a - x) + (b -y) * (b -y)), 0.5);
    }

    public static double distance (MyPoint a, MyPoint b) {
        return a.distance(b.getX(), b.getY());
    }
}
