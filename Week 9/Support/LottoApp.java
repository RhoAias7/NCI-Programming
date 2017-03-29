/*
LottoApp.java
@author F Animashaun
22/03/2017
*/

import javax.swing.JOptionPane;
public class LottoApp{
	public static void main(String args[]){
		//declare vars
		int g1,g2,g3,l1,l2,l3;
		int correct=0;

		//declare objects
		Lotto l;
		l=new Lotto();
		while(correct<9){
			//inputs
			g1=Integer.parseInt(JOptionPane.showInputDialog(null,"1st guess?"));
			g2=Integer.parseInt(JOptionPane.showInputDialog(null,"2nd guess?"));
			g3=Integer.parseInt(JOptionPane.showInputDialog(null,"3rd guess?"));
			//set
			l.setG1(g1);
			l.setG2(g2);
			l.setG3(g3);
			//compute
			l.compareNumbers();
			//get
			correct=l.getCorrect();
			//output
			JOptionPane.showMessageDialog(null,correct+" right guesses");
			//iterate the loop

		}
	}
}