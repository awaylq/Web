package com.plat.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.plat.user.pojo.User;
import com.plat.user.service.UserService;
import com.plat.utils.BasicService;

@Service("userService")
public class UserServiceImpl extends BasicService implements UserService {

	@Override
	public List<User> selectAll(){
		// TODO Auto-generated method stub
		return this.userDao.selectAll();
	}

}
