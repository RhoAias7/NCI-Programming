/*
VStarsApp.java
@author F Animashaun
29/03/2017
*/

import javax.swing.*;
public class VStarsApp{
	public static void main(String args[]){
		//declare vars
		String name, newName;

		//objects
		VStars vs;
		vs=new VStars();

		//input
		name=JOptionPane.showInputDialog(null, "What is your name?");

		//set
		vs.setName(name);

		//compute
		vs.compute();

		//get
		newName=vs.getNewName();

		//output
		JOptionPane.showMessageDialog(null,newName);

	}



}