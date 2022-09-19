package com.greatlearning.itsupport.model;

import java.util.Random;

public class Service {
	public String generateEmailID(String firstName, String lastName, String department)
	{
		return firstName.concat(lastName)+"@"+department+".greatlearning.com";
	}
	public String generatePassword()
	{
	  String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  String smallLetter = "abcdefghijklmnopqrstuvwxyz";
	  String numbers="0123456789";
	  String specialChar="!@#$%&*";
	  Random randomNumber = new Random();
	  String password="";
	  String password2 = capitalLetter.concat(smallLetter).concat(numbers).concat(specialChar);
	  for(int i=0; i<=8; i++)
	  {
		password += password2.charAt(randomNumber.nextInt(password2.length()));
	  }
      return password;              
	}

}
