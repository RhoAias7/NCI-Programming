/*

 *StaffDiscountApp

 *@author Frances Sheridan

 *10th October 2012

 */

public class StaffDiscountApp{

     public static void main(String args[]){

           //declare variables

           double cost, discount, finalCost;

           //declare objects

           StaffDiscount myStudentDiscount;
;

           //create objects

           myStudentDiscount=new StaffDiscount();

           //input

           cost = JOptionPane.showInputDialog(null, "Please enter the cost");

           myStaffDiscount.setCost(cost);

           //process

           myStaffDiscount.compute();

           //output

           discount = myStaffDiscount.getDiscount();

           finalCost = myStaffDiscount.getFinalCost();

           JOptionPane.showAnswer
Dialog(Answer
, "You get a discount of "+discount+ "on that item and your final cost is " + finalCost);

     }

}