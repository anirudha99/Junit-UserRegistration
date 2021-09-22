package com.testcasedemo;

import java.util.regex.Pattern;

public class UserRegistration {
	
	final String NAME = "^[A-Z][a-z]{2}[a-z]*";
	final String PHONE = "[1-9][0-9]\\s[1-9][0-9]{9}";
	
	final String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
	final String domain = "\\@[a-zA-Z0-9]+\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";

	final String EMAIL = username + domain;

	final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,20}";
	
	// Following are the lambda functions to each validating one user property.

		IValidUserDetail validateFirstNamelambda = (firstName) -> Pattern.matches(NAME, firstName);
		IValidUserDetail validateLastNamelambda = (lastName) -> Pattern.matches(NAME, lastName);
		IValidUserDetail validatePhonelambda = (phone) -> Pattern.matches(PHONE, phone);
		IValidUserDetail validateEmaillambda = (email) -> Pattern.matches(EMAIL, email);
		IValidUserDetail validatePasswordlambda = (password) -> Pattern.matches(PASSWORD, password);

	/**
	 * @param firstname
	 * @return true if valid first name
	 * uses lamdba function
	 * @throws InvalidUserDetailException
	 */
	public boolean validateFirstName(String firstname) throws InvalidUserDetailException {
		boolean result = validateFirstNamelambda.validateUserDetail(firstname);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(firstname);
		}
	}

	/**
	 * @param lastname
	 * @return true if valid last name
	 * uses lamdba function
	 * @throws InvalidUserDetailException
	 */
	public boolean validateLastName(String lastname) throws InvalidUserDetailException {
		boolean result = validateLastNamelambda.validateUserDetail(lastname);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(lastname);
		}
	}

	/**
	 * @param phoneNumber
	 * @return true if valid phone number
	 * uses lamdba function
	 * @throws InvalidUserDetailException
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserDetailException{
		boolean result = validatePhonelambda.validateUserDetail(phoneNumber);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(phoneNumber);
		}
	}
	
	/**
	 * @param email
	 * @return true if valid email
	 * uses lamdba function
	 * @throws InvalidUserDetailException
	 */
	public boolean validateEmail(String email) throws InvalidUserDetailException {
		boolean result = validateEmaillambda.validateUserDetail(email);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(email);
		}
		
	}
	
	/**
	 * @param password
	 * @return true if valid password
	 * uses lamdba function
	 * @throws InvalidUserDetailException
	 */
	public boolean validatePassword(String password) throws InvalidUserDetailException{
		boolean result = validatePasswordlambda.validateUserDetail(password);
		if (result) {
			return true;
		}
		else {
			throw new InvalidUserDetailException(password);
		}
	}

}
