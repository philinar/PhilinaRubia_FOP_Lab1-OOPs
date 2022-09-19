package com.greatlearning.itsupport.driver;

import java.util.Scanner;

import com.greatlearning.itsupport.model.Employee;
import com.greatlearning.itsupport.model.Service;

public class Driver
{
	public static void main(String[] args) 
	{
	  Employee employee = new Employee("Philina", "Rubia");
	  employee.getFirstName();
	  employee.getLastName();
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter The Department From The Following");
      System.out.println("1. Technical");
      System.out.println("2. Admin");
      System.out.println("3. HR");
      System.out.println("4. Legal");
      int option =sc.nextInt();
      Service service = new Service();
      String email ="";
      String password = "";
      switch(option)
      {
        case 1:	
        		email=service.generateEmailID(employee.getFirstName(), employee.getLastName(), "Tech");
        		password= service.generatePassword();
        break;
	    case 2:
	    		email=service.generateEmailID(employee.getFirstName(), employee.getLastName(), "Admin");
	    		password= service.generatePassword();
	    break;	 
	    case 3:
	    		email=service.generateEmailID(employee.getFirstName(), employee.getLastName(), "HR");
	    		password= service.generatePassword();
	    break;
	    case 4:		
	    		email=service.generateEmailID(employee.getFirstName(), employee.getLastName(), "Legal");
	    		password= service.generatePassword();
	    break;
      }
      System.out.println("Dear " + employee.getFirstName() + employee.getLastName() + " your generated credentials are as follows:");
      System.out.println("Email: " + email);
      System.out.println("Password: " + password);
    } 
}
