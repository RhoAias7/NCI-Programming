/*
NumberApp.java
@author F Animashaun
24/03/2017
*/

import javax.swing.JOptionPane;
public class NumberApp{
	public static void main(String args[]){
		//declare vars
		int userNo;
		int total;

		//declare objects
		Number num;
		num=new Number();

		//input

			userNo=Integer.parseInt(JOptionPane.showInputDialog(null, "Please input a number."));

			//set
			num.setUserNo(userNo);

			//compute
			num.compute();

			//get
			total=num.getTotal();

			//output
			JOptionPane.showMessageDialog(null, total);





	}



	}