/*
WeeklyWage.java
@author F Animashaun
21/02/17
*/

public class WeeklyWage{

	//data members
	private String name;
	private double paid;
	private int day;
	private double totalPay;

	//constructor
	public WeeklyWage(){
		name="";
		paid=0.0;
		day=0;
		totalPay=0.0;
		}

	//setters - these are also known as questions
	public void setName(String name){
		this.name=name;
		//variable name is the same as the variable name in app class
		}

	public void setPaid(double paid){
		this.paid=paid;
		}

	public void setDay(int day){
		this.day=day;
		}

	//comupte
	public void compute(){
		totalPay=day*paid;
		}

	//getters - what do we return to the user
	public String getName(){
		return name;
		}

	public double getTotalPay(){
		return totalPay;
		}


	}