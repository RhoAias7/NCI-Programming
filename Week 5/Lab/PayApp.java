/*
 *PayApp
 *@author F Animashaun
 *27th Feb 2017
*/

import javax.swing.JOptionPane;
public class PayApp{
	public static void main(String args[]){

		//declare variables
		double basicPayRate, basicPayForTheWeek, overtimePayForTheWeek, totalPay;
		int noOfBasicHoursWorkPerWeek, noOfOvertimeHours;

		//declare objects
		Pay myPay;

		//create objects
		myPay=new Pay();

		//input
		basicPayRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your basic pay rate. "));
		myPay.setBasicPayRate(basicPayRate);

		noOfBasicHoursWorkPerWeek = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your basic hours per week. "));
		myPay.setNoOfBasicHoursWorkPerWeek(noOfBasicHoursWorkPerWeek);

		noOfOvertimeHours = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your overtime hours. "));
		myPay.setNoOfOvertimeHours(noOfOvertimeHours);

		//process
		myPay.compute();

		//output
		basicPayForTheWeek = myPay.getBasicPayForTheWeek();
		JOptionPane.showMessageDialog(null, "Here is your basic pay for the week: "+basicPayForTheWeek);

		overtimePayForTheWeek = myPay.getOvertimePayForTheWeek();
		JOptionPane.showMessageDialog(null, "Here is your overtime pay for the week: "+overtimePayForTheWeek);

		totalPay = myPay.getTotalPay();
		JOptionPane.showMessageDialog(null, "Here is your total pay for the week: "+totalPay);
		}

	}