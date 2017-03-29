/*
CinemaApp.java
@Author F Animashaun
28/02/17
*/

import javax.swing.*;
public class CinemaApp{
	public static void main(String args[]){

		//variable
		int age;
		String message;

		//objects
		Cinema myCinema;
		myCinema=new Cinema();

		//inputs
		age=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));//ask the question and store the answer
		myCinema.setAge(age);//sends across the age to the instan class

		//process
		myCinema.compute();

		//output
		message=myCinema.getMessage();
		JOptionPane.showMessageDialog(null, message);

		}




	}