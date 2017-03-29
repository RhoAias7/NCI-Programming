/*
GuessApp.java
@Author F Animashaun
03/03/2017
*/

import javax.swing.*;
public class GuessApp{
	public static void main(String args[]){
		//variable
		int userNo;
		int randomNo;
		String message;

		//objects
		Guess myGuess;
		myGuess=new Guess();

		//input
		userNo=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your number"));
		myGuess.setUserNo(userNo);

		//process
		myGuess.compute();

		//output
		message=myGuess.getMessage();
		JOptionPane.showMessageDialog(null, message);

		randomNo=myGuess.getRandomNo();
		JOptionPane.showMessageDialog(null, randomNo);


		}

	}