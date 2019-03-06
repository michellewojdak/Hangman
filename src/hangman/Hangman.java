/*
 * Michelle Wojdak
 * Word Guessing game
 * 03/05/2019
 */
package hangman;

import javax.swing.*;
public class Hangman {
    public static void main(String[] args) {
        String letter;
        String wordToGuess;
        String blankWord;
        int wordLength;
        int position;
        int guesses =0;
        //Ask the user to guess a letter in the alphabet
        letter = JOptionPane.showInputDialog(
                "Number of Guesses remaining:" + guesses + "\n"
                + "Guess a Letter:\n");
        String word[] = {"WINTER", "SUMMER", "SPRING", "FALL"};
        
        //pick a random word from the array
        wordToGuess = word[(int) (Math.random() * word.length)];
        
        //determine the length of the word
        wordLength = wordToGuess.length();
        
        //display "-" to replace all letters in word to guess
        blankWord = "";
        for(position =0; position<wordLength; position ++){
            blankWord += "- ";
        }
        System.out.print("Category: Seasons");
        System.out.println(blankWord);
        
        //change the letter to uppeCase to match words
        letter = letter.toUpperCase();      
        
        //if the letter that is guessed is in the word, replace the dash in the word with the corresponding letter
        for(position= 0; position < wordLength; position ++){
            if (( "" + wordToGuess.charAt(position)).equals(letter)) {
               blankWord = blankWord.replace("- ", letter);
            }
        }            
    }
    
}
