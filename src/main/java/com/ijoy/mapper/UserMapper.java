package com.ijoy.mapper;

import com.ijoy.modal.User;

public interface UserMapper {
	/**
	 * 新增用户
	 * @param user
	 * @return  放回用户的Id,userId
	 */
	public int insert(User user);

}
