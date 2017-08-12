package com.plat.user.service;

import java.util.List;

import com.plat.user.pojo.User;

/**
 * 查询全部用户信息
 * @author xjf
 */
public interface UserService {
	public List<User> selectAll();
}
