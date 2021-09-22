package com.testcasedemo;

/**
 * @author anirudhasm
 * Custom exception class
 */
@SuppressWarnings("serial")
public class InvalidUserDetailException extends Exception {
	InvalidUserDetailException(String message){
		super(message);
	}

}
