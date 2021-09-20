package com.testcasedemo;

import java.util.regex.Pattern;

public class UserRegistration {
	
	final String NAME = "^[A-Z][a-z]{2}[a-z]*";
	final String PHONE = "[1-9][0-9]\\s[1-9][0-9]{9}";
	
	final String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
	final String domain = "\\@[a-zA-Z0-9]+\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";

	final String EMAIL = username + domain;

	final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,20}";


	public boolean validateFirstName(String firstname) {
		return Pattern.matches(NAME, firstname);
	}

	public boolean validateLastName(String lastname) {
		return Pattern.matches(NAME, lastname);
	}

	public boolean validatePhoneNumber(String phoneNumber) {
		return Pattern.matches(PHONE, phoneNumber);
	}
	
	public boolean validateEmail(String email) {
		return Pattern.matches(EMAIL, email);

	}
	
	public boolean validatePassword(String password) {
		return Pattern.matches(PASSWORD, password);
	}

}
