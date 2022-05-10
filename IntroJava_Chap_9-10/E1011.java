/*
(Geometry: the Circle2D class) Define the Circle2D class that contains:
■■ Two double data fields named x and y that specify the center of the circle with getter methods.
■■ A data field radius with a getter method.
■■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.
■■ A constructor that creates a circle with the specified x, y, and radius.
■■ A method getArea() that returns the area of the circle.
■■ A method getPerimeter() that returns the perimeter of the circle.
■■ A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle (see Figure 10.21a).
■■ A method contains(Circle2D circle) that returns true if the specified circle is inside this circle (see Figure 10.21b).
■■ A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle (see Figure 10.21c).

Draw the UML diagram for the class then implement the class. Write a test
program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
displays its area and perimeter, and displays the result of c1.contains(3,
3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
Circle2D(3, 5, 2.3)).
*/


public class E1011 {
    public static void main(String[]args){
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("C1 contains (3, 3)? " + c1.contains(3, 3));
        System.out.println("C1 contains (4, 5, 10.5)? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("C1 overlaps (4, 5, 10.5)? " + c1.overlaps(new Circle2D(4, 5, 10.5)));
        System.out.println("C1 contains (3, 5, 2.3)? " + c1.contains(new Circle2D(3, 5, 2.3)));
        System.out.println("C1 overlaps (3, 5, 2.3)? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D{
    private double x;
    private double y;
    private double radius;

    //Constructor
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D(){
        this(0, 0, 1);
    }

    //Methods
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    public boolean contains (double x, double y) {
        return (this.distance(x, y) < radius);
    }

    public boolean contains (Circle2D circle) {
        return (this.distance(circle.getX(), circle.getY()) + circle.getRadius() < radius);
    }

    public double distance(double x, double y) {
        return Math.pow(((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)), 0.5);
    }

    public boolean overlaps(Circle2D circle){
        return (this.distance(circle.getX(), circle.getY()) + circle.getRadius() > radius) 
            && (this.distance(circle.getX(), circle.getY()) - circle.getRadius() < radius);
    }

}
