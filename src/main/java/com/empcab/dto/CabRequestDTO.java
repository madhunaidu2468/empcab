package com.empcab.dto;

public class CabRequestDTO {

	private long cabId;

	private long driverId;

	private String cabNo;

	private String cabType;

	private String engineNo;

	private String rcNo;

	private String vehicleType;

	public long getCabId() {
		return cabId;
	}

	public void setCabId(long cabId) {
		this.cabId = cabId;
	}

	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}

	public String getCabNo() {
		return cabNo;
	}

	public void setCabNo(String cabNo) {
		this.cabNo = cabNo;
	}

	public String getCabType() {
		return cabType;
	}

	public void setCabType(String cabType) {
		this.cabType = cabType;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getRcNo() {
		return rcNo;
	}

	public void setRcNo(String rcNo) {
		this.rcNo = rcNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "CabRequestDTO [cabId=" + cabId + ", driverId=" + driverId + ", cabNo=" + cabNo + ", cabType=" + cabType
				+ ", engineNo=" + engineNo + ", rcNo=" + rcNo + ", vehicleType=" + vehicleType + "]";
	}

}
