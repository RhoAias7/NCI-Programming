/*
Theatre1.java
@author F Animashaun
10/04/2017
*/

import javax.swing.*;
public class Theatre1{
	public static void main(String args[]){

		//variables
		String day;
		double cost;
		int age;

		//input
		day=JOptionPane.showInputDialog(null, "Please enter the day of the week");
		age=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));


		//process & output
		if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")){
			if(age<10 || age>65){
				JOptionPane.showMessageDialog(null,"The admission is free");
			}
			else{
				JOptionPane.showMessageDialog(null,"The admission is €10");
			}
		}
		else if(day.equals("Friday")||day.equals("Saturday")||day.equals("Sunday")){
			if(age<10 || age>65){
				JOptionPane.showMessageDialog(null,"The admission is €10");
			}
			else{
				JOptionPane.showMessageDialog(null, "The admission is €20");
			}
		}


	}
}