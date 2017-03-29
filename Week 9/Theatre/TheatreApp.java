/*
TheatreApp.java
@author F Animashaun
27/03/2017
*/

import javax.swing.JOptionPane;
public class TheatreApp{
	public static void main(String args[]){

		//declare variables
		String day;
		int age;
		int price;

		//declare and create objects
		Theatre myTheatre;
		myTheatre=new Theatre();

		//inputs
		day=JOptionPane.showInputDialog(null,"Please input the day that you would like to go to the cinema.");
		myTheatre.setDay(day);

		age=Integer.parseInt(JOptionPane.showInputDialog(null,"Please input your age."));
		myTheatre.setAge(age);

		//process
		myTheatre.compute();

		//output
		price=myTheatre.getPrice();
		if(price==-1){
			JOptionPane.showMessageDialog(null, "You have insterted an invalid day");
		}
		else{
			JOptionPane.showMessageDialog(null, "Here is your ticket "+price);
		}
	}
}