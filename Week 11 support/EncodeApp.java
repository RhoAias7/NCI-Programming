/*
EncodeApp.java
@author F Animashaun
*/

import javax.swing.*;
public class EncodeApp{
	public static void main(String args[]){
		//declare var
		String userInput;
		String encoded;

		Encode en;
		en=new Encode();

		userInput=JOptionPane.showInputDialog(null, "Please put a word in the box below");
		en.setUserInput(userInput);

		en.compute();

		encoded=en.getEncoded();
		JOptionPane.showMessageDialog(null, encoded);

	}
}