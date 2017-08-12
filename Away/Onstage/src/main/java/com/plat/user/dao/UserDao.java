package com.plat.user.dao;

import java.util.List;

import com.plat.user.pojo.User;

public interface UserDao {
	
	//查询全部
	List<User> selectAll();
	
}