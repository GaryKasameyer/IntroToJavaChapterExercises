package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/22/2017.

 (Game: hangman) Write a hangman game that randomly generates a word and
 prompts the user to guess one letter at a time, as shown in the sample run. Each
 letter in the word is displayed as an asterisk. When the user makes a correct
 guess, the actual letter is then displayed. When the user finishes a word, display
 the number of misses and ask the user whether to continue to play with another
 word. Declare an array to store words, as follows:

 // Add any words you wish in this array
 String[] words = {"write", "that", ...};

 (Guess) Enter a letter in word ******* > p
 (Guess) Enter a letter in word p****** > r
 (Guess) Enter a letter in word pr**r** > p
 p is already in the word
 (Guess) Enter a letter in word pr**r** > o
 (Guess) Enter a letter in word pro*r** > g
 (Guess) Enter a letter in word progr** > n
 n is not in the word
 (Guess) Enter a letter in word progr** > m
 (Guess) Enter a letter in word progr*m > a
 The word is program. You missed 1 time
 Do you want to guess another word? Enter y or n>

 */
public class Exercise_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"program", "scorpion", "alkaline"};
        char[] alreadyGuessed, wordToGuess, hiddenWord;
        boolean wordGuessedCompletely = false;
        int alreadyGuessedIndex = 0;
        int[] misses = {0};
        char another = 'y', guess;

        while (another == 'y') {
            // Pick Random word from words
            int randomWordIndex = (int) (Math.random() * words.length);
            // Create char[] for word, and hiddenWord, and already guessed
            wordToGuess = new char[words[randomWordIndex].length()];
            hiddenWord = new char[wordToGuess.length];
            alreadyGuessed = new char[26];

            // Get random word to guess, and make wordToGuess[] and hiddenWord[]
            for (int index = 0; index < wordToGuess.length; index++) {
                wordToGuess[index] = words[randomWordIndex].charAt(index);
                hiddenWord[index] = '*';
            }

            while (!wordGuessedCompletely) {
                // prompt user for guess while showing current hiddenWord with any correct guessed letter
                System.out.printf("(Guess) Enter a letter in word %1s > ", printHiddenWord(hiddenWord));
                guess = Character.toLowerCase(input.next().charAt(0));

                checkGuess(alreadyGuessed, wordToGuess, hiddenWord, guess, misses);
                wordGuessedCompletely = guessCorrect(wordToGuess, hiddenWord);
                alreadyGuessed[alreadyGuessedIndex++] = guess;
            }

            // Print the word and misses
            System.out.printf("The word is %1s. You missed %1d times.\n", printHiddenWord(hiddenWord), misses[0]);
            // Prompt user to play again
            System.out.print("Do you want to guess another word? Enter y or n: ");
            another = Character.toLowerCase(input.next().charAt(0));
            // Reset variables to play next game
            wordGuessedCompletely = false;
            misses[0] = 0;
            alreadyGuessedIndex = 0;
        }
    }

    /** Use printHiddenWord to create and return a String of the hiddenWord[] */
    public static String printHiddenWord(char[] hiddenWord) {
        String temp = "";
        for (char e : hiddenWord)
            temp += e;
        return temp;
    }

    /**
     * Use checkGuess to determine if the letter has already been guessed, if so print char already guessed and return to while loop
     * Otherwise check if the word is in the wordToGuess[], if it is, modify the hiddenWord[] to show that letter
     * Otherwise add guess to alreadyGuessed[] and increase misses,
     */
    public static void checkGuess(char[] alreadyGuessed, char[] wordToGuess, char[] hiddenWord, char guess, int[] misses) {
        boolean charAlreadyGuessed, guessInWord = false;

        // use forEach loop to check if guess is in alreadyGuessed
        for (char e : alreadyGuessed) {
            charAlreadyGuessed = (e == guess);
            // if guess already in word print out message
            if (charAlreadyGuessed) {
                System.out.println(guess + " is already in the word.");
                return;
            }
        }

        // Check if guess isn't in the word
        for (int i = 0; i < wordToGuess.length; i++) {
            if (guess == wordToGuess[i]) {
                guessInWord = true;
                break;
            }
        }

        if (!guessInWord) {
            System.out.println(guess + " is not in the word. ");
            misses[0]++;
            return;
        }

        if(guessInWord){
            for(int i = 0; i < wordToGuess.length; i++){
                if(guess == wordToGuess[i])
                    hiddenWord[i] = guess;
            }
        }
    }

    /** Use guessCorrect to see if the char[] of wordToGuess and hiddenWord are strictly equal */
    public static boolean guessCorrect(char[] wordToGuess, char[] hiddenWord){
        String word = "", hidden = "";

        // Use for loop to make strings of each char[], use .equals to see if they are exactly the same string
        for(int i = 0; i < wordToGuess.length; i++){
            word += wordToGuess[i];
            hidden += hiddenWord[i];
        }

        return word.equals(hidden);
    }
}

























