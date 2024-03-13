package com.payments.test.service;

/**
 * Author      	 : Dev 
 * Description   : Model class for Shift4Request
 * Created Date  : 05/12/2023
 * Modified By   : Elgi Eldhose
 * Modified Date : 20/12/2023
 * Modified For  : Verifying the Javadoc comments
 * ****/

public class Shift4Request {
	
	private Card card;
	private String dateTime;
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
}
