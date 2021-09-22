package com.testcasedemo;

/**
 * @author anirudhasm
 * This is a Functional Interface which is used by each of
 * our lambda expression.
 */
@FunctionalInterface
public interface IValidUserDetail {
	
	boolean validateUserDetail(String detail);
}
