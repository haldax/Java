/*
(Financial: the Tax class) Programming Exercise 8.12 writes a program for
computing taxes using arrays. Design a class named Tax to contain the following
instance data fields:
■■ int filingStatus: One of the four tax-filing statuses: 0—single filer,
1—married filing jointly or qualifying widow(er), 2—married filing separately,
and 3—head of household. Use the public static constants SINGLE_FILER
(0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_
SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
■■ int[][] brackets: Stores the tax brackets for each filing status.
■■ double[] rates: Stores the tax rates for each bracket.
■■ double taxableIncome: Stores the taxable income.
Provide the getter and setter methods for each data field and the getTax()
method that returns the tax. Also, provide a no-arg constructor and the constructor
Tax(filingStatus, brackets, rates, taxableIncome).
Draw the UML diagram for the class and then implement the class. Write a test
program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
are shown in Table 10.1.
*/

import java.util.Scanner;

public class E1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] brackets2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297360},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
            };
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        System.out.println("(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status:");
        int status = input.nextInt();
        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();
        Tax person = new Tax(status, brackets2001, rates2001, income);
        System.out.println(person.getTax());
        input.close();
    }
        
}

class Tax {
    // DATA fields
    private int filingStatus;
    private final int SINGLE_FILER = 0;
    private final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    private final int MARRIED_SEPARATELY = 2;
    private final int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets = {
        {8350, 33950, 82250, 171550, 372950}, // Single filer
        {16700, 67900, 137050, 20885, 372950}, // Married jointly  −or qualifying widow(er)
        {8350, 33950, 68525, 104425, 186475}, // Married separately
        {11950, 45500, 117450, 190200, 372950} // Head of household
        };
    private double[] rates = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
    private double taxableIncome;

    //Constructor
    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        setIncome(taxableIncome);
    }

    public Tax() {
    }

    //Methods
    public int getFilingStatus(){
        return filingStatus;
    }

    public double[] getRates(){
        return rates;
    }

    public int[][] getBrackets(){
        return brackets;
    }
    public double getIncome(){
        return taxableIncome;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setIncome(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    public void setBrackets(int[][] brackets){
        this.brackets = brackets;
    }

    public void setRates(double[] rates){
        this.rates = rates;
    }

    public double getTax() {
        double tax = 0;
        double incomeTaxed = 0;
        for (int i = brackets[0].length - 1; i >= 0; i--) {
            if (taxableIncome > brackets[filingStatus][i]) {
                incomeTaxed = taxableIncome - brackets[filingStatus][i];
                tax += incomeTaxed * rates[i+1];
                incomeTaxed -= incomeTaxed;
            }
        }
        tax += brackets[filingStatus][0] * rates[0];
        return tax;
    }
   
}
