/*
BirthStoneApp.java
author L Murphy
07/03/2017
*/

import javax.swing.*;
public class BirthStoneApp{
	public static void main(String args[]){

	String month;
	String answer;

	BirthStone stoner;
	stoner=new BirthStone();

	month=JOptionPane.showInputDialog(null, "Please enter the month in which you were born");
	stoner.setMonth(month);

	stoner.compute();

	answer=stoner.getAnswer();
	JOptionPane.showMessageDialog(null, "Here is your stone: "+answer);





		}
	}