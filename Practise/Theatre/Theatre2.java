/*
Theatre2.java
@author F Animashaun
10/04/2017
*/

import javax.swing.*;
public class Theatre2{
	public static void main(String args[]){

		//variables
		String day;
		int age;

		//input
		day=JOptionPane.showInputDialog(null, "Please enter a day");
		age=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));

		//process & output
		if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")){
			JOptionPane.showMessageDialog(null, "The cost is €5");
		}
		else if(day.equals("Friday")||day.equals("Saturday")||day.equals("Sunday")){
			JOptionPane.showMessageDialog(null, "The cost is €20");
		}
	}
}
