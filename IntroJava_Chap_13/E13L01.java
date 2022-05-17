//Abstract class with implementation of interfaces
import java.util.Date;
public class E13L01 {
    public static void main(String[] args) {
        GeometricObject a = new Circle(5);
        GeometricObject b = new Rectangle(3, 5);
        System.out.println(a.compareTo(b));
    }
}

//Superclass
abstract class GeometricObject implements Comparable<GeometricObject>{
    //Data encapsulation
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    //Constructor is defined as protected because it is used only by subclasses (even outside the package)
    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        setColor(color);
        setFilled(filled);
        dateCreated = new Date();
    }

    //Methods
    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDate(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    //Public abstrct methods does not have implementation, does not have a body, ends with;
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        return (getArea() > o.getArea()) ? 1 : ((getArea() < o.getArea()) ? -1 : 0);
    }
    
}

//Subclass
class Circle extends GeometricObject{
    //Data fields (all data fields in superclass are inherited)
    private double radius;

    //Constructor
    public Circle(){
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled){
        //Calling constructor from super class  --> always put on the first line of command
        super(color, filled);
        setRadius(radius);
    }

    //Methods
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // Implement
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    public void printCircle(){
        System.out.println("The circle is created " + getDate() + " and the radius is " + radius);
    }

    @Override
    public String toString(){
        return super.toString() + "\nradius is " + radius;
    }

}

//Subclass 
class Rectangle extends GeometricObject {
    //data fields
    private double width = 1;
    private double height = 1;

    // constructor
    public Rectangle() {  
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // method
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }
}

