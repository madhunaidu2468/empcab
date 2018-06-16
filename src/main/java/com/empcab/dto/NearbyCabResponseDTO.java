/**
 * 
 */
package com.empcab.dto;

/**
 * @author Madhu.R
 *
 */
public class NearbyCabResponseDTO {

	private long cabId;
	private double lat;
	private double lon;
	private String type;
	private String dist;
	
	public long getCabId() {
		return cabId;
	}
	public void setCabId(long cabId) {
		this.cabId = cabId;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	@Override
	public String toString() {
		return "NearbyCabResponseDTO [cabId=" + cabId + ", lat=" + lat
				+ ", lon=" + lon + ", type=" + type + ", dist=" + dist + "]";
	}

}
