/*
Pay.java
@author F Animashaun
27/02/2017
*/

public class Pay{

	//declare data memeber

	private double basicPayRate;
	private int noOfBasicHoursWorkPerWeek;
	private int noOfOvertimeHours;
	private double basicPayForTheWeek;
	private double overtimePayForTheWeek;
	private double totalPay;

	public Pay(){
		basicPayRate = 0.0;
		noOfBasicHoursWorkPerWeek = 0;
		noOfOvertimeHours = 0;
		basicPayForTheWeek = 0.0;
		overtimePayForTheWeek = 0.0;
		totalPay = 0.0;
		}

	public void setBasicPayRate(double basicPayRate){
		this.basicPayRate = basicPayRate;
		}

	public void setNoOfBasicHoursWorkPerWeek(int noOfBasicHoursWorkPerWeek){
		this.noOfBasicHoursWorkPerWeek = noOfBasicHoursWorkPerWeek;
		}

	public void setNoOfOvertimeHours(int noOfOvertimeHours){
		this.noOfOvertimeHours = noOfOvertimeHours;
		}

	public void compute(){
		basicPayForTheWeek = basicPayRate*noOfBasicHoursWorkPerWeek;
		overtimePayForTheWeek = (basicPayRate*noOfOvertimeHours)*1.5;
		totalPay = overtimePayForTheWeek+basicPayForTheWeek;
     	}

	public double getBasicPayForTheWeek(){
		return basicPayForTheWeek;
		}

	public double getOvertimePayForTheWeek(){
		return overtimePayForTheWeek;
		}

	public double getTotalPay(){
			return totalPay;
		}
	}
