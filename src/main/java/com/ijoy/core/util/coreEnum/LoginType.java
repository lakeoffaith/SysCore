package com.ijoy.core.util.coreEnum;

public enum LoginType {
	PhoneLogin(0),EmailLogin(1);
	private int code;
	private LoginType(int number){
		this.code=number;
	}
	public int getNumberCode() {
		return code;
	}
	public void setNumberCode(int numberCode) {
		this.code = numberCode;
	}
	
	
}
