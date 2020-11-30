package com.registeration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) throws UserRegisterationException {
		System.out.println("Welcome to user registration");

		// PRINTING RESULT OF FIRST NAME
		System.out.println("Enter first name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		boolean firstNameResult = isValidFirstName(firstName);
		if (firstNameResult == true) {
			System.out.println("Valid First name");
		} else {
			throw new UserRegisterationException("Please Enter Proper First Name");
		}
		// PRINTING RESULT OF LASTNAME
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		boolean lastNameResult = isValidLastName(lastName);
		if (lastNameResult == true) {
			System.out.println("Valid last name");
		} else {
			throw new UserRegisterationException("Please Enter Proper First Name");
		}

		// PRINTING RESULT OF EMAIL
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		boolean emailResult = isValidEmail(email);
		if (emailResult == true) {
			System.out.println("Valid Email");
		} else {
			throw new UserRegisterationException("Please Enter Proper First Name");
		}

		// PRINTING RESULT OF PHONE NUMBER
		System.out.println("Enter phone number: ");
		String phoneNumber = sc.nextLine();
		boolean numberResult = isValidPhoneNumber(phoneNumber);
		if (numberResult == true) {
			System.out.println("Valid phone number");
		} else {
			System.out.println("Invalid phone number");
		}

		// PRINTING RESULT OF PASSWORD
		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		boolean minEightPassword = isValidPassword(password);
		boolean upperCasePassword = isOneUpperCaseValidPassword(password);
		boolean numericPassword = isOneNumericValidPassword(password);
		boolean specialCharPassword = isSpecialValidPassword(password);
		if (minEightPassword == true && upperCasePassword == true && numericPassword == true
				&& specialCharPassword == true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	// CHECKING VALID OR INVALID FIRST NAME
	public static boolean isValidFirstName(String firstName) {
		String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		Pattern ptrn = Pattern.compile(firstNamePattern);
		Matcher mchr = ptrn.matcher(firstName);
		return mchr.matches();
	}

	// CHECKING VALID OR INVALID LAST NAME
	public static boolean isValidLastName(String lastName) {
		String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		Pattern ptrn = Pattern.compile(lastNamePattern);
		Matcher mchr = ptrn.matcher(lastName);
		return mchr.matches();
	}

	// CHECKING VALID OR INVALID EMAIL
	public static boolean isValidEmail(String email) {
		String emailPattern = "^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$";
		Pattern ptrn = Pattern.compile(emailPattern);
		Matcher mchr = ptrn.matcher(email);
		return mchr.matches();
	}

	// CHECKING VALID OR INVALID PHONE NUMBER
	public static boolean isValidPhoneNumber(String phoneNumber) {
		String mobileNumberPattern = "^[+]?[0-9]{2}[ ][0-9]{10}$";
		Pattern ptrn = Pattern.compile(mobileNumberPattern);
		Matcher mchr = ptrn.matcher(phoneNumber);
		return mchr.matches();
	}

	// CHECKING PASSWORD LENGTH MINIMUM 8 CHARACTER
	public static boolean isValidPassword(String password) {
		String passwordPattern = ".{8,}";
		Pattern ptrn = Pattern.compile(passwordPattern);
		Matcher mchr = ptrn.matcher(password);
		return mchr.matches();
	}

	// CHECKING PASSWORD HAVE ONE UPPER CASE
	public static boolean isOneUpperCaseValidPassword(String upperCase) {
		String passwordPattern = ".*[A-Z]+.*";
		Pattern ptrn = Pattern.compile(passwordPattern);
		Matcher mchr = ptrn.matcher(upperCase);
		return mchr.matches();
	}

	// CHECKING PASSWORD HAVE ONE NUMERIC
	public static boolean isOneNumericValidPassword(String oneNumeric) {
		String passwordPattern = ".*[0-9]+.*";
		Pattern ptrn = Pattern.compile(passwordPattern);
		Matcher mchr = ptrn.matcher(oneNumeric);
		return mchr.matches();
	}

	// CHECKING PASSWORD HAVE EXACTLY ONE SPECIAL CHARACTER
	public static boolean isSpecialValidPassword(String SpecialCharater) {
		String passwordPattern = "^[^!@#$%^&*(),.?\":{}|<>]*[!@#$%^&*(),.?:\"{}|<>][^!@#$%^&*(),.?\":{}|<>]*$";
		Pattern ptrn = Pattern.compile(passwordPattern);
		Matcher mchr = ptrn.matcher(SpecialCharater);
		return mchr.matches();
	}

}
