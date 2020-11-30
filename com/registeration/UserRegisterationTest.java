package com.registeration;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidFirstName("Himanshu");
		Assert.assertEquals(true ,result );
		
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidFirstName("Hi");
		Assert.assertEquals(false, result);
		
	}

	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result=userValidation.isValidFirstName("Him@");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenFirstName_WhenWithNumeric_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidFirstName("Himanshu1");
		Assert.assertEquals(false, result);
		}

	@Test
	public void givenFirstName_WhenWithFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidFirstName("himanshu");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WhenWithBlankSpaces_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidFirstName("Himanshu1");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidLastName("Yadav");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidLastName("Ya");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidLastName("Y@dav");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithNumeric_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidLastName("Yadav1");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidLastName("yadav");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithBlankSpaces_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidLastName("ya dav");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithSplCharShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc-100@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithDotInPrefix_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc.100@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithDigitsAndNumber_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc111@abc.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithTwoTLD_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc.100@abc.com.au");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithNumberInTLD_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc@1.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithPlus_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc+100@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithoutAtTheRateSymbol_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("yadavhimanshu63gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenTldDoesNotStartWithDot_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc@.com.my");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenShortTld_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc123@gmail.a");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenStartWithDot_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail(".abc@abc.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenWithSplCharExceptUnderScoreOrDash_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenTldOnlyCharOrDigit_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc@%*.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenWithDoubleDot_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc..2002@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenEmailNameEndWithDot_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc.@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenWithDoubleAtTheRate_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc@abc@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenTldWithDigit_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc@gmail.com.1a");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenMoreThanTwoTld_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("abc@gmail.com.aa.au");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobile_WhenWithCountryCode_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidEmail("91 1234567890");
  	}

	@Test
	public void givenMobile_WhenWithPlusCountryCode_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidPhoneNumber("+91 1234567890");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobile_WhenNoCountryCode_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidPhoneNumber("1234567890");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobile_WhenWithPlusButNoCountryCode_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidPhoneNumber("+ 1234567890");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobile_WhenNoGap_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidPhoneNumber("+911234567890");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobile_WhenShort_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidPhoneNumber("91 12345678");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidPassword("Q1qwer@wr");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isValidPassword("Q1W@w");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenWithOutUpperCase_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isOneUpperCaseValidPassword("qw!1qwerr");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenWithOutNumeric_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isOneNumericValidPassword("Qqwer@wr");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenMoreSplChar_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.isSpecialValidPassword("Qqwe!r@wr");
		Assert.assertEquals(false, result);
	}

}


