/*
Theatre1.java
author L Murphy
07/03/2017
*/

//Comparing String

//Monday -  Thurday = 20 euros
//Friday - Sunday = 30 euros
import javax.swing.*;
public class Theatre1{
	public static void main(String args[]){

		//variables
		String day;

		//input
		day=JOptionPane.showInputDialog(null, "Please enter the day you want to come to the theatre");

		//process and output
		if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")){
			JOptionPane.showMessageDialog(null, "The cost of your ticket is 20");
		}

		else if(day.equalsIgnoreCase("Friday")||day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
						JOptionPane.showMessageDialog(null, "The cost of your ticket is 30");
		}

		else{
			JOptionPane.showMessageDialog(null, "This is an invalid day");
		}
	}
}