package com.ijoy.service;

import java.util.List;

public interface IUserService {
	/**
	 * 
	 * @param userId  User表的Id
	 * @return  返回 菜单的list集合
	 */
	public List getMenusByUserId(int userId);
	
	
	/**
	 * 
	 * @param userId  User表的Id
	 * @return  返回 按钮基本操作权限的list集合
	 */
	public List getButtonsByUserId(int userId);
}
