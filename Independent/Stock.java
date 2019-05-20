package Independent;

/**
 * Created by Gary Kasameyer on 5/6/2017.

 (The Stock class) Following the example of the Circle class in Section 9.2,
 design a class named Stock that contains:

 ■ A string data field named symbol for the stock’s symbol.
 ■ A string data field named name for the stock’s name.
 ■ A double data field named previousClosingPrice that stores the stock price for the previous day.
 ■ A double data field named currentPrice that stores the stock price for the current time.
 ■ A constructor that creates a stock with the specified symbol and name.
 ■ A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.

 Draw the UML diagram for the class and then implement the class. Write a test
 program that creates a Stock object with the stock symbol ORCL, the name
 Oracle Corporation, and the previous closing price of 34.5. Set a new current
 price to 34.35 and display the price-change percentage.

 UML:
        Stock
 -symbol: String
 -name: String
 -previousClosingPrice: double
 -currentPrice: double
 ------------------------
 +Stock(symbol: String, name: String)
 +getSymbol(): String
 +setSymbol(symbol: String): void
 +getStock(): String
 +setStock(stock: String): void
 +getPreviousClosingPrice(): double
 +setPreviousClosingPrice(previousClosingPrice: double): void
 +getCurrentPrice(): double
 +setCurrentPrice(currentPrice: double): void
 +getChangePercent(): double (returns percentage changed from previousClosingPrice to currentPrice)
 */

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
        previousClosingPrice = 0;
        currentPrice = 0;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStock() {
        return name;
    }

    public void setStock(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}
