/**
 * 
 */
package com.empcab.dto;

/**
 * @author Madhu.R
 *
 */
public class CabResponseDTO {

	private long cabId;

	private long driverId;

	private String cabNo;

	private String driverName;

	private String driverNo;

	private String cabType;

	public CabResponseDTO() {
		super();
	}

	public CabResponseDTO(int defValues, String cabType) {
		this.cabId=defValues;
		this.driverId=defValues;
		this.cabNo="KA 01 AA 0101";
		this.driverName="driver1";
		this.driverNo="09845098450";
		this.cabType=cabType;
	}

	
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

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverNo() {
		return driverNo;
	}

	public void setDriverNo(String driverNo) {
		this.driverNo = driverNo;
	}

	public String getCabType() {
		return cabType;
	}

	public void setCabType(String cabType) {
		this.cabType = cabType;
	}

	@Override
	public String toString() {
		return "CabResponseDTO [cabId=" + cabId + ", driverId=" + driverId
				+ ", cabNo=" + cabNo + ", driverName=" + driverName
				+ ", driverNo=" + driverNo + ", cabType=" + cabType + "]";
	}

}
