/*
MonthsApp.java
@Author F Animashaun
28/02/17
*/

import javax.swing.*;
public class MonthsApp{
	public static void main(String args[]){

		//variable
		int month;
		String message;

		//objects
		Months myMonths;
		myMonths Months();

		//imputs
		months=Integer.parseInt(JOptionPane(null, "Please enter a number."));
		myMonths.setMonths(month);

		//process
		myMonths.compute();

		message=myMonths.getMessage();
		JOptionPane.showMessageDialog(null, message);

		}



	}