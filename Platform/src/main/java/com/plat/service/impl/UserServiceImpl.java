package com.plat.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.plat.dao.UserDao;
import com.plat.pojo.User;
import com.plat.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(id);
	}

}
