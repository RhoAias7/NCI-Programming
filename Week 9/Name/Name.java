/*
Name.java
@author F Animashaun
21/03/2017
*/

//create an apllication to ask the user for their name three times
//and then print out that name saying "Ok.... i get it, your name is ..."

import javax.swing.*;
public class name{
	public static void main(String args[]){

	//variables
	String name;

	name="";

	for(int i=1;i<=3;i=i+1){//creates the loop 3 times
		name = JOptionPane.showInputDialog(null, "What is your name?");
	}
	JOptionPane.showMessageDialog(null, "ok, I get it, your name is "+ name);
	}
}