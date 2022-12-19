package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
	public static boolean checkValidPassword(String pWord) {
		String pWordregex = ("[a-zA-Z0-9]{8,}");
		Pattern pattern = Pattern.compile(pWordregex);
		if (pWord == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(pWord);
		return matcher.matches();

	}

	public static void main(String[] args) {
		String email = "bridgelabz218";
		boolean isPasswordValid = checkValidPassword(email);
		if (isPasswordValid) {
			System.out.println(email + " is valid");
		} else {
			System.out.println(email + " is not valid");
		}

	}

}
