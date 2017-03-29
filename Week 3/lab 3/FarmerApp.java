/*
Farmer.java
@author F Animashaun
17/02/2017
*/

//John the farmer has tasked his son with collecting the eggs from the chicken
//coop each morning and putting them in boxes of 1 dozen eggs each. Unfortunately
//Johns son Joe is having trouble working out how many boxes he will need each morning.
//You have been asked to develop a java application to allow Joe to enter the number of
//eggs he has collected.  The application should then calculate and output how many boxes
//can be filled and how many eggs Joe will have leftover.

//Your application should use instantiable classes to separate the calculations from the user input and output.

//*Hint: there are 12 eggs in 1 dozen


import javax.swing.JOptionPane;
public class FarmerApp{
	public static void main(String args[]){

		//declare variables


		//This variable will be my input
		int numOfEggs=0;

		//These varibles will be my outputs
		int numOfBoxes=0;
		int numOfLeftovers=0;



		//declare and create objects
		Farmer farm;
		farm=new Farmer();

		//take inputs
		numOfEggs=Integer.parseInt(JOptionPane.showInputDialog("How many eggs do you have?","eg 12"));

		//set methods
		farm.egg(numOfEggs);
		farm.eggsLeft(numOfLeftovers);

		//compute
		farm.compute();

		//get method
		numOfBoxes=farm.getNumOfBoxes();
		numOfLeftovers=farm.getNumOfLeftovers();

		//output
		JOptionPane.showMessageDialog(null, "Number of boxes needed: "+numOfBoxes);
		JOptionPane.showMessageDialog(null, "Number of leftovers: "+numOfLeftovers);

		}



	}