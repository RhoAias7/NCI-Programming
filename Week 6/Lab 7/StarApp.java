/*StarApp .java
@author F Animashaun
10/03/2017
*/
import javax.swing.*;
public class StarApp{
	public static void main(String args[]){
	//vars
	String month;
	int date;
	String star;

	//objects
	Star myStar;
	myStar = new Star();

	//inputs
	month=JOptionPane.showInputDialog(null, "What month were you born in?");
	myStar.setMonth(month);

	date=Integer.parseInt(JOptionPane.showInputDialog(null, "What date?"));
	myStar.setDate(date);

	//process
	myStar.compute();

	//output
	star=myStar.getStar();
	JOptionPane.showMessageDialog(null, "Your star is "+ star);


}
}