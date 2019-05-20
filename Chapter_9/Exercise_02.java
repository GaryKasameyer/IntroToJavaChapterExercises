package Chapter9_Exercises;

import Independent.Stock;

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

public class Exercise_02 {
    public static void main(String[] args) {
        Stock orcl = new Stock("ORCL", "Oracle Corporation");

        orcl.setPreviousClosingPrice(34.5);
        orcl.setCurrentPrice(34.35);

        System.out.print("Price-Change Percentage: " + orcl.getChangePercent());
    }
}
