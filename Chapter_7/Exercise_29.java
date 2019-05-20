package Chapter7_Exercises;

/**
 * Created by Gary Kasameyer on 11/19/2017.

 (Game: pick four cards) Write a program that picks four cards from a deck of 52
 cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
 12, and 11, respectively. Your program should display the number of picks that
 yields the sum of 24.

 */
public class Exercise_29 {
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"},
                suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int[] deck = createDeck(), cardsPickedSuits = new int[4], cardsPicked = new int[4];
        int valueOfCardsPicked = 0, numberOfPicks = 0, i = 0;

        // Use while loop to pick each next card
        while(valueOfCardsPicked != 24){
            // Populate suitsFound and ranksFound with card picked
            for(int j = 0; j < 4; j++) {
                cardsPickedSuits[j] = (deck[i] / 13);
                cardsPicked[j] = (deck[i++] % 13);
                if(i == 51) {
                    deck = createDeck();
                    i = 0;
                }
            }
            numberOfPicks += 4;
            // if all suits have been found end loop, else increase i to pick next card
            valueOfCardsPicked = (cardsPicked[0] + cardsPicked[1] + cardsPicked[2] + cardsPicked[3]) + 4;

        }

        // Print out the cards suits and rand, then the number of cards picked
        for(int j = 0; j < cardsPicked.length; j++){
            System.out.println(ranks[cardsPicked[j]] + " of " + suits[cardsPickedSuits[j]]);
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
