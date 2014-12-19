package com.numberguess;

import java.util.ArrayList;
import java.util.List;

import com.numberguess.util.UserInputUtil;
import com.numberguess.validator.AppValidator;

/**
 * Implements Number Guess game 
 * <br> 
 * Write a program in Java to play a number-guessing game (between 1 and 100). The game works as follows:
 * <br>
 * The user chooses a number in his mind and types “ready” to indicate to the computer that he is ready to begin playing.
 * The computer asks a series of questions to arrive at the number the user has in mind. The user can only respond with “higher”, “lower” or “yes”.
 * The game ends when the user responds with “yes” or “end”.
 * <br>
 * Example: User chooses number 40 in his mind.
 * Computer: Is the number 30?
 * User: higher
 * Computer: Is the number 50?
 * User: lower
 * Computer: Is the number 35?
 * User: higher
 * Computer: Is the number 40?
 * User: yes
 * <br>
 * <br>
 * The Algorithm goes:
 * <br>
 * The binary search algorithm is used to solve this problem. It's the more efficient way too.
 * Start the guessing by selecting mid point which is 50 (in this case).
 * If the user inputs his/her chosen number is higher, the mid point becomes the new lower limit.
 * Else the mid point becomes new upper limit
 * The new guess now will be midpoint of new upper and lower limits.
 * Repeat until the correct guess is done
 * <br> 
 * To illustrate an example - let's assume user chose 61.
 * <br>
 * Sample run :
 * Is the number 50?
 * User Input : higher
 * Is the number 75?
 * User Input : lower
 * Is the number 64?
 * User Input : lower?
 * Is the number 62?
 * User Input : lower
 * Is the number 61?
 * User Input : yes
 * <br>
 * So what's happening here in each step? 
 * lower = 1, higher = 100 => guess = 50 50 < 61 so lower = 51
 * lower = 51, higher = 100 => guess = 75 75 > 61 so higher = 76
 * lower = 51, higher = 76 => guess = 64 64 > 61 so higher = 64
 * lower = 51, higher = 64 => guess = 62 62 > 61 so higher = 62
 * lower = 51, higher = 62 => guess = 61 61 == 61 done.
 * <br>
 * (c) Copyright Nish Voduru 2014.
 * 
 * Creation date: (12/19/2014 1:48:36 PM)
 * @author: Nish Voduru - nishi4@hotmail.com
 */
public class App 
{
	private static final int LOWER = 1;
	private static final int HIGHER = 100;
    public static void main( String[] args )
    {
    	//  prompt the user to play a card trick
    	System.out.print("Do you want to play number guess game (ready/not)?: ");
    	//  open up standard input
    	String userResponse = UserInputUtil.readUserResponse();
    	List<String> validResponses = new ArrayList<String>();
    	validResponses.add("ready");
    	validResponses.add("not");
    	AppValidator.validateResponse(userResponse, validResponses);
    	if("not".equalsIgnoreCase(userResponse)){
    		System.out.println("Good Bye!!!");
    		System.exit(1);
    	}else{
    		int low = LOWER;
    		int high = HIGHER;
    		int guess = (low+high)/2;
    		while (!"yes".equalsIgnoreCase(userResponse)){
    			System.out.println("Is the number " + guess + "? (higher/lower/yes): ");
    			userResponse = UserInputUtil.readUserResponse();
    	    	validResponses = new ArrayList<String>();
    	    	validResponses.add("higher");
    	    	validResponses.add("lower");
    	    	validResponses.add("yes");
    	    	AppValidator.validateResponse(userResponse, validResponses);
    		    if("lower".equalsIgnoreCase(userResponse)) {
    		    	high = guess;
    		    } else if ("higher".equalsIgnoreCase(userResponse)){
    		        low = guess + 1;
    			}
    		    guess = (low+high)/2;
    		}
    		System.out.println("Good Bye !!!");
    	}
    }
}