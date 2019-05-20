package Chapter7_Exercises;

/**
 * Created by Gary Kasameyer on 11/18/2017.

 (Simulation: coupon collector’s problem) Coupon collector is a classic statistics
 problem with many practical applications. The problem is to pick objects from
 a set of objects repeatedly and find out how many picks are needed for all the
 objects to be picked at least once. A variation of the problem is to pick cards from
 a shuffled deck of 52 cards repeatedly and find out how many picks are needed
 before you see one of each suit. Assume a picked card is placed back in the deck
 before picking another. Write a program to simulate the number of picks needed
 to get four cards from each suit and display the four cards picked (it is possible a
 card may be picked twice). Here is a sample run of the program:

 Queen of Spades
 5 of Clubs
 Queen of Hearts
 4 of Diamonds
 Number of picks: 12

 */
public class Exercise_24 {
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"},
                suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int[] deck = createDeck(), suitsFound = new int[4], ranksFound = new int[4];
        boolean fourSuitsFound = false;
        int numberOfPicks = 1, i = 0;

        // Use while loop to pick each next card
        while(!fourSuitsFound){
            // Check if the suit of that card is not marked found in suits found
            if(suitsFound[deck[i] / 13] == 0) {
                // Populate suitsFound and ranksFound with card picked
                suitsFound[deck[i] / 13] = (deck[i] / 13);
                ranksFound[deck[i] / 13] = (deck[i] % 13);
                // increase number of cards picked
                numberOfPicks++;
            }

            // if all suits have been found end loop, else increase i to pick next card
            if(suitsFound[0] == 0 && suitsFound[1] == 1 && suitsFound[2] == 2 && suitsFound[3] == 3)
                fourSuitsFound = true;
            else
                i++;
        }

        // Print out the cards suits and rand, then the number of cards picked
        for(int j = 0; j < suitsFound.length; j++){
            System.out.println(ranks[ranksFound[j]] + " of " + suits[suitsFound[j]]);
        }
        System.out.print("Number of picks: " + numberOfPicks);

    }

    /** Use createDeck to make, shuffle and return a deck */
    public static int[] createDeck(){
        int[] deck = new int[52];

        // Create the deck by giving each card an int value
        // deck[card] / 13 == suit
        // deck[card] % 13 == rank
        for(int card = 0; card < deck.length; card++)
            deck[card] = card;

        // Shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Return the deck
        return deck;
    }
}
