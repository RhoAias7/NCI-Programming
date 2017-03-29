/*

 *Staff Discount.java

*@author Frances Sheridan

*10th October 2012

*/

public class StaffDiscount{

     //declare data members

     private double cost;

     private double discount;

     private double finalCost;

     private final int DISC = 10;



     public StaffDiscount(){
		 cost = 0.0;
         discount = 0.0;
         finalCost = 0.0;
     }

     public void setCost(double cost){
		 this.cost = cost;
		 }

     public void compute(){
		discount = (cost/100)*DISC;
		finalCost = cost - discount;
     }

     public double
 		getDiscount(){
			return discount;
			}
	public double getFinalCost(){

           return finalCost;

     }

}