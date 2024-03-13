package com.payments.test.service;

/**
 * Author      	 : Shivam 
 * Description   : Model class for Card Details
 * Created Date  : 05/11/2023
 * Modified By   : Elgi Eldhose
 * Modified Date : 20/12/2023
 * Modified For  : Verifying the Javadoc comments
 * ****/


public class Card {

	private String number;
	private String expirationDate;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

}
