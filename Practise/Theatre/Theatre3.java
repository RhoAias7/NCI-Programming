/*
Theatre3.java
@author F Animashaun
10/04/2017
*/

import javax.swing.*;
public class Theatre3{
	public static void main(String args[]){
		//declare variables
		String day;

		//input
		day=JOptionPane.showInputDialog(null, "Please enter the day");

		//process & output
		switch(day){
			case "Monday":
				JOptionPane.showMessageDialog(null, "The admission is €5");
				break;

			case "Tuesday":
				JOptionPane.showMessageDialog(null, "The admission is €5");
				break;

			case "Wednesday":
				JOptionPane.showMessageDialog(null, "The admission is €5");
				break;

			case "Thursday":
				JOptionPane.showMessageDialog(null, "The admission is €5");
				break;

			case "Friday":
				JOptionPane.showMessageDialog(null, "The admission is €20");
				break;

			case "Saturday":
				JOptionPane.showMessageDialog(null, "The admission is €20");
				break;

			case "Sunday":
				JOptionPane.showMessageDialog(null, "The admission is €20");
				break;
			default:
				JOptionPane.showMessageDialog(null, "That is not a valid day");
				break;


		}
	}
}