package Chapter3_Exercises;

/**
 * Created by Gary Kasameyer on 9/1/2017.

 (Game: pick a card) Write a program that simulates picking a card from a deck
 of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 Here is a sample run of the program:

 */
public class Exercise_24 {
    public static void main(String[] args) {
        int card = (int)(Math.random() * ((52 - 1) + 1) + 1), cardSuite = card / 13, cardValue = card % 13;
        String suite = "", face = "";

        switch(cardSuite){
            case 0:
                suite = "Clubs";
                break;
            case 1:
                suite = "Hearts";
                break;
            case 2:
                suite = "Spades";
                break;
            case 3:
                suite = "Diamonds";
                break;
        }

        switch(cardValue){
            case 0:
                face = "King";
                break;
            case 1:
                face = "One";
                break;
            case 2:
                face = "Two";
                break;
            case 3:
                face = "Three";
                break;
            case 4:
                face = "Four";
                break;
            case 5:
                face = "Five";
                break;
            case 6:
                face = "Six";
                break;
            case 7:
                face = "Seven";
                break;
            case 8:
                face = "Eight";
                break;
            case 9:
                face = "Nine";
                break;
            case 10:
                face = "Ten";
                break;
            case 11:
                face = "Jack";
                break;
            case 12:
                face = "Queen";
                break;
        }

        System.out.print("The card you picked is " + face + " of " + suite);
    }
}
