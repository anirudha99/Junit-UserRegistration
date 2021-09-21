package com.testcase;

import org.junit.Assert;
import org.junit.Test;

import com.testcasedemo.UserRegistration;

public class UserRegistrationTest {
	
	/**
	 * To test the valid first name condition
	 */
	@Test
	public void givenfirstname_ifitsproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("Anirudha");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case passes if the given first name length
	 * is lesser than 3 because it needs to be more
	 */
	@Test
	public void givenfirstname_iflengthisshort_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("SM");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case passes if the first name starts with lower letter
	 * because we need upper case
	 */
	@Test
	public void givenfirstname_wherefirstletternotcapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("anirudha");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case passes if we provide a proper last name
	 */
	@Test
	public void givenlastname_ifitsproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("Mayya");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case passes when we give atleast 3 characters for last name
	 */
	@Test
	public void givenlastname_itisshort_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("Sme");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case passes if we give last name starting
	 * with the capital letter
	 */
	@Test
	public void givenlastname_firstletterisnotcapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("Mayya");
		Assert.assertTrue(result);
	}

	/**
	 * Test case passes if we provide proper mobile number
	 * with 10 digits and country code
	 */
	@Test
	public void givenphonenumber_itisproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 9067453251");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case fails if no country code is given
	 */
	@Test
	public void givenphonenumber_withoutcountrycode_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("8660886760");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case fails if there is no 10 digits in phone number
	 */
	@Test
	public void givenphonenumber_lessthantendigit_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 866088676");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case passes because it is invalid to have more than 
	 * 1 space after country code for mobile number 
	 */
	@Test
	public void givenphonenumber_morethanonespaceaftercountrycode_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91  8660886760");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test passes because it is invalid to give mobile number starting with 0
	 */
	@Test
	public void givenphonenumber_thatstartswithzero_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 0660886760");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case passes if valid password is provided
	 */
	@Test
	public void givenpassword_whichisvalid_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("tempGoogle@45");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test cases passes when invalid password without capital letter is provided 
	 */
	@Test
	public void givenpassword_withoutcaps_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("examplepass@13");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test cases passes if invalid password without digit is provided
	 */
	@Test
	public void givenpassword_withoutdigit_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("examplePass");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test cases passes if invalid password without special character is provided
	 */
	@Test
	public void givenpassword_withoutspecialchar_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("tempGoogle45");
		Assert.assertFalse(result);
	}
	
	/**
	 *  Test cases passes if invalid password without the
	 *  length of 8 is provided
	 */
	@Test
	public void givenpassword_whichisshort_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("exam@13");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case passes when a valid mail id is provided
	 */
	@Test
	public void givenemail_whichisproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("anirudhamayya23@gmail.com");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case passes when invalid  mail id is given
	 */
	@Test
	public void givenemail_whichisinvalid_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("examplemail@11");
		Assert.assertFalse(result);
	}
}
