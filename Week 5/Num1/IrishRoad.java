/*
IrishRoad.java
@author F Animashaun
21/02/17
*/

public class IrishRoad{

	//data members
	private int noOfSingleTrips;
	private int noOfReturnTrips;
	private double singleTripPrice;
	private double returnTripPrice;
	private double totalCost;

	//constructor
	public IrishRoad(){
		noOfSingleTrips=0;
		noOfReturnTrips=0;
		singleTripPrice=0.0;
		returnTripPrice=0.0;
		totalCost=0.0;
		}

	//setters
	public void setNoOfSingleTrips(int noOfSingleTrips){
		this.noOfSingleTrips=noOfSingleTrips;
		}

	public void setNoOfReturnTrips(int noOfReturnTrips){
		this.noOfReturnTrips=noOfReturnTrips;
		}

	//compute
	public void compute(){
		totalCost=(noOfSingleTrips*singleTripPrice)+(noOfReturnTrips*returnTripPrice);
		}

	//getters
	public double getTotalCost(){
		return totalCost;
		}




	}
