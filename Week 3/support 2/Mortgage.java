/*
*Mortgage.java
@Author Ayodele Animashaun
15 February 2017
*/

//Create an application that takes in a house value from the user,
//as well as a deposit, and an interest rate. The application should then
//calculate stamp duty at 1% on the house without the deposit,
//and with the deposit

public class Mortgage{

	//declare variables
	private double price;
	private double deposit;
	private double stamp;
	private double dStamp;

	//constructor
	public Mortgage(){
		price=0.0;
		deposit=0.0;
		stamp=0.0;
		dStamp=0.0;
		}

	//set methods
	public void harambe(double price){
		this.price=price;
		}

	public void sam(double price){
			this.deposit=deposit;
		}

	//compute
	public void compute(){
		stamp=price*0.01;
		dStamp=(price-deposit)*0.01;
		}

	//get method
	public double getStamp(){
		return stamp;
		}

	public double getDStamp(){
			return stamp;

		}



	}