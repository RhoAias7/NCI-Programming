/*
BirthStone.java
author L Murphy
07/03/2017
*/

//Application that asks the user for what month that they were both in and prints out the birthstone that represents that month

public class BirthStone{

	private String month;
	private String answer;

	//constructor
	public BirthStone(){
		month="";
		answer="";
		}

	public void setMonth(String month){
		this.month=month;
		}

	public void compute(){
		switch(month){
			case "January ":
			answer="garnet";
			break;
			case "February	":
			answer="amethyst";
			break;
			case "March":
			answer="aquamarine";
			break;
			case "April":
			answer="Diamond";
			break;
			case "May":
			answer="Emerald";
			break;
			case "June":
			answer="Pearl Alexandrite";
			break;
			case "July":
			answer="Ruby";
			break;
			case "August":
			answer="Peridot Sardonyx Spinel";
			break;
			case "September":
			answer="Sapphire";
			break;
			case "October":
			answer="Tourmaline Opal";
			break;
			case "November":
			answer="Topaz Citrine";
			break;
			case "December":
			answer="Tanzanite Zircon Turquoise";
			break;

			}
		}
	public String getAnswer(){
		return answer;
		}
	}
