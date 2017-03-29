import javax.swing.*;
public class LeapYearApp{
	public static void main(String args[]){

		//variable
		int year;
		String message;

		//declare and create object
		LeapYear l;
		l=new LeapYear();

		//input
		year=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a year!"));
		l.setYear(year);

		l.compute();

		message=l.getMessage();
		JOptionPane.showMessageDialog(null, message);






	}


}