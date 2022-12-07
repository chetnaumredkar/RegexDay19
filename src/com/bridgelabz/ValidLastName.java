package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLastName {
	
		public static boolean checkValidLastName(String LastName) {
			String lastNameregex = "[A-Z][a-z]{3,}";
			Pattern pattern = Pattern.compile(lastNameregex);
			if (LastName == null) {
				return false;
			}
			Matcher matcher = pattern.matcher(LastName);
			return matcher.matches();

		}

		public static void main(String[] args) {
			String lastName = "Umredkar";
			boolean isLastNameValid = checkValidLastName(lastName);
			if (isLastNameValid) {
				System.out.println(lastName + " is valid");
			} else {
				System.out.println(lastName + " is not valid");
			}

		}
	}



