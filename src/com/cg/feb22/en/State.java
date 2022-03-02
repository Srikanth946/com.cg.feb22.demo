package com.cg.feb22.en;

public enum State {

	MAHARASHTRA("MH"), TELANGANA("TS"), KARNATAKA("KA"), OTHER_STATE("OS");

	public final String stateCode;

	State(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateCode() {
		return this.stateCode;
	}
}