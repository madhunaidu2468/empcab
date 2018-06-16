/**
 * 
 */
package com.empcab.dto;

/**
 * @author Madhu.R
 *
 */
public class TripDetailsResponseDTO {

	private long cabId;
	private UserResponseDTO user;
	private CabResponseDTO cab;
	private double startLat;
	private double startLong;
	private double endLat;
	private double endLong;
	private String tripType;
	private String cabType;
	private String coupon;
	private double amount;
	private String status;
	private double userRating;
	private double driverRating;
	public long getCabId() {
		return cabId;
	}
	public void setCabId(long cabId) {
		this.cabId = cabId;
	}
	public UserResponseDTO getUser() {
		return user;
	}
	public void setUser(UserResponseDTO user) {
		this.user = user;
	}
	public CabResponseDTO getCab() {
		return cab;
	}
	public void setCab(CabResponseDTO cab) {
		this.cab = cab;
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
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getUserRating() {
		return userRating;
	}
	public void setUserRating(double userRating) {
		this.userRating = userRating;
	}
	public double getDriverRating() {
		return driverRating;
	}
	public void setDriverRating(double driverRating) {
		this.driverRating = driverRating;
	}
	@Override
	public String toString() {
		return "TripDetailsResponseDTO [cabId=" + cabId + ", user=" + user
				+ ", cab=" + cab + ", startLat=" + startLat + ", startLong="
				+ startLong + ", endLat=" + endLat + ", endLong=" + endLong
				+ ", tripType=" + tripType + ", cabType=" + cabType
				+ ", coupon=" + coupon + ", amount=" + amount + ", status="
				+ status + ", userRating=" + userRating + ", driverRating="
				+ driverRating + "]";
	}

}
