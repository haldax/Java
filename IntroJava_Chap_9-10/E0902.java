/* (The Stock class) Following the example of the Circle class in Section 9.2,
design a class named Stock that contains:
■■ A string data field named symbol for the stock’s symbol.
■■ A string data field named name for the stock’s name.
■■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■■ A double data field named currentPrice that stores the stock price for the
current time.
■■ A constructor that creates a stock with the specified symbol and name.
■■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
Draw the UML diagram for the class then implement the class. Write a test program
that creates a Stock object with the stock symbol ORCL, the name Oracle
Corporation, and the previous closing price of 34.5. Set a new current price to
34.35 and display the price-change percentage.
*/

public class E0902 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.35);
        stock1.setPreviousClosingPrice(34.5);
        System.out.println("The price change of " + stock1.getName() + " is " + stock1.getChangePercent() + "%.");

    }
}

class Stock {
    //data fields
    private String symbol;
    private String name;
    double previousClosingPrice;
    double currentPrice;

    // constructor
    public Stock(String symbol,String name) {
        this.symbol = symbol;
        this.name = name;
    }

    //method
    public double getChangePercent() {
        return (currentPrice / previousClosingPrice - 1) * 100;
    }
    public void setCurrentPrice(double price) {
        currentPrice = price;
    }
    public void setPreviousClosingPrice(double price) {
        previousClosingPrice = price;
    }
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
}