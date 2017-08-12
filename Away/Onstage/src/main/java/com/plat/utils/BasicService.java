package com.plat.utils;

import javax.annotation.Resource;

import com.plat.user.dao.UserDao;

public class BasicService {
	@Resource
	protected UserDao userDao;
}
