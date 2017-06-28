package com.plat.service.test.impl;

import org.springframework.stereotype.Service;

import com.plat.pojo.test.User;
import com.plat.service.BasicService;
import com.plat.service.test.UserService;

@Service("userService")
public class UserServiceImpl extends BasicService implements UserService {

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(id);
	}

}
