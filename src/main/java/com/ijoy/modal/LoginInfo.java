package com.ijoy.modal;

import java.util.Date;

import com.ijoy.core.util.coreEnum.LoginType;

public class LoginInfo {
	private int id;
	private String code;
	private String loginName;
	private Date lastLoginTime;
	private int loginType;
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	
	public int getLoginType() {
		return loginType;
	}
	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "LoginInfo [id=" + id + ", lastLoginTime=" + lastLoginTime + ", code=" + code + ", loginName="
				+ loginName + ", loginType=" + loginType + "]";
	}
	
	
	
}
