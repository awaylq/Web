package com.plat.utils;

import javax.annotation.Resource;

import com.google.gson.Gson;
import com.plat.user.service.UserService;

public class BasicController {

	protected Gson gson = new Gson();
	@Resource
	protected UserService userService;
}
