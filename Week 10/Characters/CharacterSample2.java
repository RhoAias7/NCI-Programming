/*
CharacterSample2.java
@author F Animashaun
28/03/2017
*/

//Create an application that asks the user to enter a word and get the application to print each letter out individually.

import javax.swing.*;
public class CharacterSample2{
	public static void main(String args[]){

		//variables
		String word;
		int len;

		//ask the question
		word=JOptionPane.showInputDialog(null, "Please enter a word");
		len=word.length(); //gets the length of the word
		for(int i=0; i<len; i++){
			//using a loop to access each character. Start the loop at 0 and work right up until the length <3 is found
			JOptionPane.showMessageDialog(null, word.charAt(i));
			//print out each individual character in the word in the loop
		}

		JOptionPane.showMessageDialog(null, "So the word is "+word);
		//print out thee full word
	}
}
