/*
HolidayApp.java
@author F Animashaun
01/03/17
*/

import javax.swing.*;
public class HolidayApp{
	public static void main(String args[]){

		String season, answer;
		int people, cost;

		Holiday myHoliday;
		myHoliday=new Holiday();

		//input
		do{
			season=JOptionPane.showInputDialog(null, "Please enter a season.");
			people=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of people you have. "));

			myHoliday.setSeason(season);
			myHoliday.setPeople(people);

			//compute
			myHoliday.compute();

			//get
			cost=myHoliday.getCost();

			//output
			JOptionPane.showMessageDialog(null,"Here is your cost "+cost);
			answer=JOptionPane.showInputDialog(null, "Again?");
			}while(answer.equalsIgnoreCase("y"));
	}





}