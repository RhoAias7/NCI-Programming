/*
Results.java
@ author F Animashaun
8 Feb 2017
*/

import javax.swing.JOptionPane;
public class Results{
	public static void main (String[] args){
		//declare variable
		double exam1,exam2,exam3,average;
		int roundedAverage;
		int downAverage;
		int upAverage;

		//inputs
		exam1=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter the first result"));
		exam2=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter the second result"));
		exam3=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter the third result"));
		//process
		average=(exam1+exam2+exam3)/3;
		roundedAverage=(int)Math.round(average);
		downAverage=(int)Math.floor(average);
		upAverage=(int)Math.ceil(average);
		//output
		JOptionPane.showMessageDialog(null,"Here is your average "+average);
		JOptionPane.showMessageDialog(null,"Rounded "+roundedAverage);
		JOptionPane.showMessageDialog(null,"Down "+downAverage);
		JOptionPane.showMessageDialog(null,"Up "+upAverage);





		}





}