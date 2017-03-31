/*
ReverseApp.java
@author F Animashaun
28/03/2017
*/

import javax.swing.*;
public class ReverseApp{
	public static void main(String args[]){

		//declare variables
		String word,newWord;
		int len;

		//declare and create objects
		Reverse urgot;
		urgot=new Reverse();

		//inputs
		word=JOptionPane.showInputDialog(null, "Please input your name");
		urgot.setWord(word);

		//compute
		urgot.compute();

		//get
		newWord=urgot.getNewWord();

		//output
		JOptionPane.showMessageDialog(null,newWord);

	}

}
