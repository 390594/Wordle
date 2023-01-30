
/**
 * Wordle in a terminal with some color codes
 *
 * @ By Daniel Hoskins
 * @version (1/26/23)
 */

import java.util.Scanner;

public class Wordle
{
    public static void main (String[] args)
    {
        //Making the background of each letter with these color codes
        final String BG_GREEN = "\u001b[32m";
        final String BG_YELLOW = "\u001b[33m";
        final String RESET = "\u001b[0m";

        System.out.println("WORDLE!");
        String correct = "SHAKE";

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please guess ---> ");
        String guess;
        guess = sc.nextLine();
        guess =

        // Making a loop to compare through each letter
        //it's 5 because there's 5 letters in wordle
        for (int i=0;i<5;i++) 
        {
            if (guess.substring(i,i+1) == (correct.substring(i,i+1))) {

                //if the letters match, green highlight
                System.out.print(BG_GREEN + guess.substring(0,1) + RESET);
                //index identifies where a leter is in a different string
                //if it's not there it will return a -1
            } else if (correct.indexOf(guess.substring (i,i+1)) > -1) {
                //if letter is in word but in different spot,make it yellow 
                System.out.print(BG_YELLOW + guess.substring(i,i+1) + RESET); 
            } else {
                // if letter not found in the word, nothing happens, no color
                System.out.print(guess.substring(i,i+1));

            }
        }
    }
}

