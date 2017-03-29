/*
GUI.java
@ Author F Animashaun
14 Feb 2017
*/

import javax.swing.*; //swing class - grey pop up windows
public class Gui{
	public static void main (String args[]){

		//variables
		int num1=0;
		int num2=0;
		int total=0;
		String name="";

		//input
		//input - asks the questions
		//when using JOptionPane - it only with strings
		// to store numbers - you have to parse out
		name=JOptionPane.showInputDialog(null, "Please enter your name");
		num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your first number"));
		num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your second number"));

		//process
		total=num1+num2;

		//output
		JOptionPane.showMessageDialog(null, "Hello "+name+ " your total is " +total);

	}
}
