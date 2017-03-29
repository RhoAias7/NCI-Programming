/*
CharacterSample.java
@author F Animashaun
28/03/2017
*/

//Create an application to ask the user for their name and count the amount of character in their name.

import javax.swing.*;
public class CharacterSample{
	public static void main(String args[]){

		//declare variable
		String name; //hold the name
		int len; //hold the length

		//step 1: Ask the question
		name=JOptionPane.showInputDialog(null, "Please enter your name");

		//step 2: get the name, work out the length and store the length in my len variable
		len=name.length();

		//step 3: Print back the answer to the user
		JOptionPane.showMessageDialog(null, "There are "+len+" characters in your name");


	}
}