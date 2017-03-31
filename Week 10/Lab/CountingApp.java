/*
CountingApp.java
@author F Animashaun
31/03/2017
*/

import javax.swing.*;
public class CountingApp{
	public static void main(String arg[]){
		int i=0;
		String play="";
		do{
		//variables
		String sentence;
		int numOfVowels;
		int numOfConstants;
		int numOfSpaces;

		Counting count;
		count=new Counting();

		sentence=JOptionPane.showInputDialog(null, "Please enter a sentence");
		count.setSentence(sentence);

		count.compute();

		numOfVowels=count.getNumOfVowels();
		numOfConstants=count.getNumOfConstants();
		numOfSpaces=count.getNumOfSpaces();

		JOptionPane.showMessageDialog(null,"Here are the number of Vowels "+numOfVowels+" Here are the number of constants "+numOfConstants+" Here are the number of spaces "+numOfSpaces);
		play=JOptionPane.showInputDialog(null, "Would you like to go again?");

		i=i+1;
		}

		while(play.equals("yes"));


	}


}