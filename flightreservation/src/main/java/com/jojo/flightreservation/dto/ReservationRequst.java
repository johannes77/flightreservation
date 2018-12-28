package com.jojo.flightreservation.dto;

public class ReservationRequst {
	private Long flightId;
	private String passengerfirstName;
	private String passengerlastName;
	private String passengerEmail;
	private String passengerPhone;
	private String ameOnTheCard;
	private String cardNo;
	private String expirationDate;
	private String threeDigitSecurityCode;

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getPassengerfirstName() {
		return passengerfirstName;
	}

	public void setPassengerfirstName(String passengerfirstName) {
		this.passengerfirstName = passengerfirstName;
	}

	public String getPassengerlastName() {
		return passengerlastName;
	}

	public void setPassengerlastName(String passengerlastName) {
		this.passengerlastName = passengerlastName;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getAmeOnTheCard() {
		return ameOnTheCard;
	}

	public void setAmeOnTheCard(String ameOnTheCard) {
		this.ameOnTheCard = ameOnTheCard;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getThreeDigitSecurityCode() {
		return threeDigitSecurityCode;
	}

	public void setThreeDigitSecurityCode(String threeDigitSecurityCode) {
		this.threeDigitSecurityCode = threeDigitSecurityCode;
	}

}
