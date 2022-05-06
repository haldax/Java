
/* (Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + c = 0. The class contains:
■■ Private data fields a, b, and c that represent three coefficients.
■■ A constructor with the arguments for a, b, and c.
■■ Three getter methods for a, b, and c.
■■ A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac.
■■ The methods named getRoot1() and getRoot2() for returning two roots of the equation

///
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
Draw the UML diagram for the class then implement the class. Write a test program
that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.” See Programming Exercise 3.1 for sample runs.
*/
public class E0910 {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1, 6, 4);
        System.out.println(equation.getRoot1() + " " + equation.getRoot2());
    }
}

class QuadraticEquation {
    //Data fields
    private double a;
    private double b;
    private double c;

    //Constructor
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Methods
    public double getCoefficientA() {
        return a;
    }
    public double getCoefficientB() {
        return b;
    }
    public double getCoefficientC() {
        return c;
    }

    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }

    public double getRoot1(){
        if (this.getDiscriminant() < 0) return 0;
        else return (-1 * b + Math.pow(this.getDiscriminant(), 0.5)) / 2 /a;
    }
    public double getRoot2(){
        if (this.getDiscriminant() < 0) return 0;
        else return (-1 * b - Math.pow(this.getDiscriminant(), 0.5)) / 2 /a;
    }
    
}
