package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
	public static boolean checkValidphonenumber(String phoneNumber) {
		String phoneNumberRegex = "[1-9]{2}\s[0-9]{10}";
		Pattern pattern = Pattern.compile(phoneNumberRegex);
		if (phoneNumber == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();

	}

	public static void main(String[] args) {
		String phoneNumber = "91 1234567890";
		boolean isValid = checkValidphonenumber(phoneNumber);
		if (isValid) {
			System.out.println(phoneNumber + " is valid");
		} else {
			System.out.println(phoneNumber + " is not valid");
		}

	}

}
