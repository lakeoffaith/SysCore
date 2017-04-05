package com.ijoy.service.impl;

import java.util.Base64;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijoy.core.util.Base64Util;
import com.ijoy.core.util.coreEnum.LoginType;
import com.ijoy.mapper.LoginInfoMapper;
import com.ijoy.mapper.UserMapper;
import com.ijoy.modal.LoginInfo;
import com.ijoy.modal.User;
import com.ijoy.service.ILoginInfoService;

@Service
public class LoginInfoServiceImpl implements ILoginInfoService {
	@Autowired
	private LoginInfoMapper loginInfoMapper;
	
	@Autowired
	private UserMapper userMapper;
	public String getCodeByCellPhone(String Phone) {
		Random r=new Random();
		String code=String.valueOf(r.nextInt(9999));
		String loginName=Phone;
		//1:插入新的LoginInfo(LoginName,code,LoginType)信息，
		LoginInfo loginInfo=new LoginInfo();
		loginInfo.setCode(code);
		loginInfo.setLoginType(LoginType.PhoneLogin.getNumberCode());
		loginInfo.setLoginName(Phone);
		loginInfoMapper.insert(loginInfo);
		//2:返回code
		return code;
	}

	public String loginByPhoneAndCode(String Phone, String code) {
		//1:查询Phone和 code是否存在，flag 为true  返回loginInfo
		LoginInfo loginInfo=loginInfoMapper.getLoginInfoByPhoneAndCode(Phone,code);
		System.out.println(loginInfo);
		//2:对User表进行更新或者新增   userId不存在的情况
		
		int userId;
		if(loginInfo.getUserId()>0){
			//已经存在这个用户
			userId=loginInfo.getUserId();
			
		}else{
			//不 存在这个用户
			User user=new User();
			user.setUserName(Phone);
			userId=userMapper.insert(user);
		}
		//3:对LoginInfo进行更新
		loginInfo.setUserId(userId);
		loginInfo.setLastLoginTime(new Date());
		System.out.println(loginInfo);
		loginInfoMapper.update(loginInfo);
		//4:对新的userId进行加密处理 生产token
		String token=Base64Util.encode(userId+"^"+new Date());
		return token;
	}

	public int checkToken(String token) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
