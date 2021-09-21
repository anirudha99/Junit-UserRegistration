package com.testcase;

import java.util.Arrays;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.testcasedemo.InvalidUserDetailException;
import com.testcasedemo.UserRegistration;

@RunWith(Parameterized.class)
public class ParameterizedEmailTest {
	
	private String email;
	private boolean expectedResult;
	private UserRegistration user;
	
	public ParameterizedEmailTest(String email, boolean expectedResult) {
		super();
		this.email = email;
		this.expectedResult = expectedResult;

	}
	
	@Before
	public void initialise() {
		user = new UserRegistration();
	}
	
	/**
	 * @return Collections that contains all the emails to validate.
	 */
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com ", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}
	
	/**
	 * Tests user email from collections for validity
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void parameterized_emailtesting_returntrueorfalse() {
		try {
			Assert.assertEquals(expectedResult, user.validateEmail(email));
		} catch (InvalidUserDetailException e) {
			e.printStackTrace();
		}
	}

	
}
