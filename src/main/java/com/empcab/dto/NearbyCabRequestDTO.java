/**
 * 
 */
package com.empcab.dto;

/**
 * @author Madhu.R
 *
 */
public class NearbyCabRequestDTO {

	private double startLat;
	private double startLong;
	private double endLat;
	private double endLong;
	private String type;
	private long userId;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "NearbyCabRequestDTO [startLat=" + startLat + ", startLong=" + startLong + ", endLat=" + endLat
				+ ", endLong=" + endLong + ", type=" + type + ", userId=" + userId + "]";
	}

}
