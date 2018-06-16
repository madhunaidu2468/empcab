/**
 * 
 */
package com.empcab.dto;

/**
 * @author Madhu.R
 *
 */
public class UserResponseDTO {

	private long userId;

	private String name;

	private String phoneNo;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "UserResponseDTO [userId=" + userId + ", name=" + name
				+ ", phoneNo=" + phoneNo + "]";
	}

}
