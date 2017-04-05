package com.ijoy.mapper;

import org.apache.ibatis.annotations.Param;

import com.ijoy.modal.LoginInfo;

public interface LoginInfoMapper {

	void insert(LoginInfo loginInfo);

	LoginInfo getLoginInfoByPhoneAndCode(@Param("loginName")String loginName, @Param("code")String code);

	void update(LoginInfo loginInfo);
	
}
