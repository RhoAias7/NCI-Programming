/*
FarmerApp.java
@author F Animashaun
19/03/2017
*/

import javax.swing.*;
public class FarmerApp{
	public static void main(String args[]){

		//declare variables
		int numOfEggs;
		int numOfEggsLeftover;
		int numOfBoxes;

		Farmer farm;
		farm=new Farmer();

		//inputs
		numOfEggs=Integer.parseInt(JOptionPane.showInputDialog("Please enter how many eggs you have?")) ;

		//setters
		farm.setEggs(numOfEggs);

		//compute
		farm.compute();

		//getters
		numOfEggsLeftover=farm.getNumOfEggsLeftover();
		numOfBoxes=farm.getNumOfBoxes();

		//outputs
		JOptionPane.showMessageDialog(null, "Here are the amount of leftovers "+numOfEggsLeftover);
		JOptionPane.showMessageDialog(null, "Here are the amount of boxes that you will need "+numOfBoxes);




}




}
