/*
*MortgageApp.java
@Author Ayodele Animashaun
15 February 2017
*/

//Create an application that takes in a house value from the user,
//as well as a deposit, and an interest rate. The application should then
//calculate stamp duty at 1% on the house without the deposit,
//and with the deposit

import javax.swing.JOptionPane;
public class MortgageApp{
	public static void main(String args[]){

		//declare variables
		double price;
		double deposit;
		double stamp;
		double dStamp;

		//declare and create objects
		Mortgage mort;
		mort=new Mortgage();

		//take inputs
		deposit=Double.parseDouble(JOptionPane.showInputDialog(null, "How much deposit?","eg 25000"));
		price=Double.parseDouble(JOptionPane.showInputDialog("House Price?"));

		//set methods
		mort.harambe(price);
		mort.sam(deposit);

		//compute
		mort.compute();

		//get method
		stamp=mort.getStamp();
		dStamp=mort.getDStamp();

		//output
		JOptionPane.showMessageDialog(null, "Normal stamp: "+stamp);
		JOptionPane.showMessageDialog(null, "Stamp with desposit: "+dStamp);



		}
	}