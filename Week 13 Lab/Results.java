/*
Results.java
@author F Animashaun
21/04/17
*/

public class Results{
	//data members
	private Double results[][];
	private double bestResult;
	private double worstResult;

	//compute
	public Results(){
		results=new Double[10][3];
		bestResult=0;
		worstResult=0;
	}

	//set method
	public void setResults(Double results[][]){
		this.results=results;
	}

	//compute
	public void compute(){
		bestResult=results[0][0];
		worstResult=results[0][0];
		for(int i=0; i<results.length; i++){
			for(int q=0; q<results[i].length; q++){
				if(results[i][q]>bestResult){
					bestResult=results[i][q];
				}
				else{
					worstResult=results[i][q];
				}
			}
		}
	}

	//get method
	public double getBestResult(){
		return bestResult;
	}

	public double getWorstResult(){
		return worstResult;
	}
}