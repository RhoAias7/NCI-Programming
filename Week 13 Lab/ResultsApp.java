/*
Results.java
@author F Animashaun
21/04/17
*/

import javax.swing.*;
public class ResultsApp{
	public static void main(String args){

		//declare variables
		Double results[][] = new Double[10][3];
		Double bestResult;
		Double worstResult;

		Results myResults = new Results();

		//input
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
			results[i][j]= Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter 10 of your results"));

			}

		}
		myResults.setResults(results);

		myResults.compute();

		bestResult=myResults.getBestResult();
		JOptionPane.showMessageDialog(null, "Here is the best score "+bestResult);

		worstResult=myResults.getWorstResult();
		JOptionPane.showMessageDialog(null, "Here is the worst score "+worstResult);

	}
}