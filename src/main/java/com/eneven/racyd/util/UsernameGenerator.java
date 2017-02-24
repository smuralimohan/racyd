package com.eneven.racyd.util;

public class UsernameGenerator {

	public static String main (String [] args)
	{
		String secondName, firstName, date, username;
		Scanner in = new Scanner(System.in);
		try 
		{
			System.out.println("Please Enter Full Name: ");
			firstName = in.next();
			secondName = in.next();
			
			System.out.println("Please DOB (DD/MM/YY): ");
			date = in.next();
			
			int num1 = (Integer.parseInt(date.substring(0,2))+Integer.parseInt(date.substring(3,5))/Integer.parseInt(date.substring(7)));
			//day + month / year in order to give unique digit 
			
			int num2 = Integer.parseInt(date.substring(1,2));
			//to ensure username is unique
			
			username = secondName.substring(0,(secondName.length()-1)) + firstName.charAt(0) + num1 + num2;
			System.out.println("Your Username Is: " + username);
		} catch(Exception e) 
		{
			System.out.println("Input Error");
			e.printStackTrace();
		}
	}
}
