/*
SwapApp.java
@author F Animashaun
07/04/2017
*/

import javax.swing.*;
public class SwapApp{
	public static void main(String args[]){

		String usersWord;
		String resultant;
		StringBuffer buff;

		Swap Swapper=new Swap();

		usersWord=JOptionPane.showInputDialog(null, "Enter a sentence");
		Swapper.setUsersWord(usersWord);

		Swapper.compute();

		resultant=Swapper.getResultant();
		JOptionPane.showMessageDialog(null, "Here is the word "+resultant);
	}
}