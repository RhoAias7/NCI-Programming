/*
CinemaApp1.java
@author F Animashaun
10/04/2017
*/
import javax.swing.*;
public class CinemaApp1{
	public static void main(String args[]){

		///variables
		int age;

		//input
		age=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));

		//process & output
		if((age<5)||(age>65)){
			JOptionPane.showMessageDialog(null, "Your admission is free!");
		}
		else if((age>=5)&&(age<=14)){
			JOptionPane.showMessageDialog(null, "Your admission is €5");

		}
		else if((age>=15)&&(age<=65)){
			JOptionPane.showMessageDialog(null, "Your admission is €10");
		}

	}
}