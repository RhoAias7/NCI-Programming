/*
NumberApp.java
@author F Animashaun
18/03/2017
*/

import javax.swing.*;
public class NumberApp{
	public static void main(String args[]){

		//variables
		int num1;
		int num2;
		int total;

		//objects
		Number myNum; //bringing in file and give it a name
		myNum=new Number(); //now talking to eachother

		//input
		num1=Integer.parseInt(JOptionPane.showInputDialog("Please insert a number of your choosing"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Please insert another number"));

		//setters
		myNum.setNum1(num1);
		myNum.setNum2(num2);

		//compute
		myNum.compute();

		//get methods
		total=myNum.getTotal();

		//output
		JOptionPane.showMessageDialog(null, "Here is the sum of "+num1+" + "+num2+" = "+total);








		}


}