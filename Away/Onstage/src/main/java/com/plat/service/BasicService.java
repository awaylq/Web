package com.plat.service;

import javax.annotation.Resource;

import com.plat.dao.test.UserDao;

public class BasicService {
	@Resource
	protected UserDao userDao;
}
