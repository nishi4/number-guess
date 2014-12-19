package com.numberguess.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputUtil {
	
	/**
	 * This method reads the users response from command line
	 * @return String a response string
	 */
	public static String readUserResponse() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String response = null;
    	//  read the response from the command-line
    	try {
    		response = br.readLine();
    	} catch (IOException ioe) {
    		System.out.println("IO error trying to get user response!");
    		System.exit(1);
    	}
    	return response;
	}
}
