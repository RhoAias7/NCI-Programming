/*
WeeklyWageApp.java
@author F Animashaun
21/02/17
*/

import java.util.*;
public class WeeklyWageApp{
	public static void main (String args[]){

		//variables
		String name;
		double paid;
		int day;
		double totalPay;

		//objects
		Scanner keyboard;
		keyboard=new Scanner(System.in);
		WeeklyWage myWeeklyWage;
		myWeeklyWage=new WeeklyWage();

		//inputs
		//Ask the question
		System.out.println("Please enter your name");
		//grab the answer
		name=keyboard.nextLine();
		//send it across to my instan class
		myWeeklyWage.setName(name);

		System.out.println("Please enter how many days you work");
		day=keyboard.nextInt();
		myWeeklyWage.setDay(day);

		System.out.println("Please enter your weekly wage");
		paid=keyboard.nextDouble();
		myWeeklyWage.setPaid(paid);

		//process
		myWeeklyWage.compute();


		//outputs
		name=myWeeklyWage.getName();
		totalPay=myWeeklyWage.getTotalPay();
		System.out.println("Your total pay is "+totalPay);



		}



	}