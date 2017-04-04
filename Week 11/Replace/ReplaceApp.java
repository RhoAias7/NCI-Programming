/*
ReplaceApp.java
@author F Animashaun
04/04/2017
*/

import javax.swing.*;
public class ReplaceApp{
	public static void main(String args){
		String name;
		StringBuffer strBuff;
		String newName;

		Replace myReplace=new Replace();

		name=JOptionPane.showInputDialog(null, "Enter your name");
		myReplace.setName(name);

		myReplace.compute();

		newName=myReplace.getNewName();
		JOptionPane.showMessageDialog(null, "Your name is "+newName);
	}
}
