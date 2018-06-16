/**
 * 
 */
package com.empcab.dto;

/**
 * @author Madhu.R
 *
 */
public class TripRequestDTO {

	private long cabId;
	private long userId;
	private double startLat;
	private double startLong;
	private double endLat;
	private double endLong;
	private String tripType;
	private String cabType;
	private String coupon;

	public long getCabId() {
		return cabId;
	}
	public void setCabId(long cabId) {
		this.cabId = cabId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
	@Override
	public String toString() {
		return "TripRequestDTO [cabId=" + cabId + ", userId=" + userId
				+ ", startLat=" + startLat
				+ ", startLong=" + startLong + ", endLat=" + endLat
				+ ", endLong=" + endLong + ", tripType=" + tripType
				+ ", cabType=" + cabType + ", coupon=" + coupon + "]";
	}

}
