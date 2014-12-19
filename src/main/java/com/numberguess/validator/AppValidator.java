package com.numberguess.validator;

import java.util.List;


public class AppValidator {
	
	public static boolean validateResponse(String response, List<String> validResponses)
	{
		while(validResponses!=null && !validResponses.contains(response))
		{
			System.out.println("Invalid Input. Good Bye !!!");
		}
		return true;
	}

}
