/*
ReplaceApp.java
@author F Animashaun
04/04/2017
*/

import javax.swing.*;
public class MobileNo{
	public static void main(String args[]){
		String mobilePhoneNo;
		boolean valid;

		MobileNo MyMobileNo=new MobileNo();

		mobilePhoneNo=JOptionPane.showInputDialog(null, "Enter your phone number");
		MyMobileNo.setMobilePhoneNo(mobilePhoneNo);

		MyMobileNo.compute();

		valid=MyMobileNo.getValid();
		JOptionPane.showMessageDialog(null, "Your number is "+valid);
	}
}