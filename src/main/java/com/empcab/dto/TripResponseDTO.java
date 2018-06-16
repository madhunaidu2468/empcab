/**
 * 
 */
package com.empcab.dto;

/**
 * @author Madhu.R
 *
 */
public class TripResponseDTO {

	private long userId;
	private CabResponseDTO cab;
	private double startLat;
	private double startLong;
	private double endLat;
	private double endLong;
	private String tripType;
	private double amount;
	private String otp;



	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public CabResponseDTO getCab() {
		return cab;
	}
	public void setCab(CabResponseDTO cab) {
		this.cab = cab;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public double getStartLat() {
		return startLat;
	}
	public void setStartLat(double startLat) {
		this.startLat = startLat;
	}
	public double getStartLong() {
		return startLong;
	}
	public void setStartLong(double startLong) {
		this.startLong = startLong;
	}
	public double getEndLat() {
		return endLat;
	}
	public void setEndLat(double endLat) {
		this.endLat = endLat;
	}
	public double getEndLong() {
		return endLong;
	}
	public void setEndLong(double endLong) {
		this.endLong = endLong;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "TripResponseDTO [userId=" + userId + ", cab="
				+ cab + ", startLat=" + startLat + ", startLong=" + startLong
				+ ", endLat=" + endLat + ", endLong=" + endLong + ", tripType="
				+ tripType + ", amount=" + amount
				+ ", otp=" + otp + "]";
	}

}
