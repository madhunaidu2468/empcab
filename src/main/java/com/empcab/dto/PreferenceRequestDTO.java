package com.empcab.dto;

public class PreferenceRequestDTO {

	private String gatewayId;
	private int userId;
	private String prefNode1;
	private String prefNode2;
	private String prefNode3;
	private String prefNode4;

	public PreferenceRequestDTO() {
		super();
	}

	public String getGatewayId() {
		return gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPrefNode1() {
		return prefNode1;
	}

	public void setPrefNode1(String prefNode1) {
		this.prefNode1 = prefNode1;
	}

	public String getPrefNode2() {
		return prefNode2;
	}

	public void setPrefNode2(String prefNode2) {
		this.prefNode2 = prefNode2;
	}

	public String getPrefNode3() {
		return prefNode3;
	}

	public void setPrefNode3(String prefNode3) {
		this.prefNode3 = prefNode3;
	}

	public String getPrefNode4() {
		return prefNode4;
	}

	public void setPrefNode4(String prefNode4) {
		this.prefNode4 = prefNode4;
	}

}
