package com.testcasedemo;

import java.util.regex.Pattern;

public class UserRegistration {
	
	final String NAME = "^[A-Z][a-z]{2}[a-z]*";
	final String PHONE = "[1-9][0-9]\\s[1-9][0-9]{9}";
	
	final String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
	final String domain = "\\@[a-zA-Z0-9]+\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";

	final String EMAIL = username + domain;

	final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,20}";


	public boolean validateFirstName(String firstname) throws InvalidUserDetailException {
		boolean result = Pattern.matches(NAME, firstname);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(firstname);
		}
	}

	public boolean validateLastName(String lastname) throws InvalidUserDetailException {
		boolean result = Pattern.matches(NAME, lastname);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(lastname);
		}
	}

	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserDetailException{
		boolean result = Pattern.matches(PHONE, phoneNumber);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(phoneNumber);
		}
	}
	
	public boolean validateEmail(String email) throws InvalidUserDetailException {
		boolean result = Pattern.matches(EMAIL, email);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(email);
		}
		
	}
	
	public boolean validatePassword(String password) throws InvalidUserDetailException{
		boolean result = Pattern.matches(PASSWORD, password);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(password);
		}
	}

}
