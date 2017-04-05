package com.ijoy.service;

import javax.jws.WebService;

/**
 * 
 * @author black
 */
@WebService
public interface ILoginInfoService {
	
	/**
	 * 处理手机号获取验证码， getCodeByCellPhone
	 * @param Phone 
	 * @return
	 */
	public String getCodeByCellPhone(String Phone);
	/**
	 * 手机号和验证码登录        loginByPhoneAndCode
	 * @param Phone
	 * @param code
	 * @return token 对用户的UserId加密处理
	 */
	public String loginByPhoneAndCode(String Phone,String code);
	/**
	 * 检查token 
	 * @param token
	 * @return  userId
	 */
	public int checkToken(String token);
	

	

}
