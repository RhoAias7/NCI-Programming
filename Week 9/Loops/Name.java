/*
Name.java
@author F Animashaun
21/03/2017
*/

//Use JOptionPane
//Create an application to ask the user for their name three times and then print out that name saying "Ok ..... i get it, your name is ...."
import javax.swing.*;
public class Name{
	public static void main(String args[]){

		String name="";;
		for(int i=0; i<=3; i++){
			name=JOptionPane.showInputDialog(null, "What is your name?");
		}
		JOptionPane.showMessageDialog(null, "Ok "+name+" i get it, your name is "+name);




	}


}