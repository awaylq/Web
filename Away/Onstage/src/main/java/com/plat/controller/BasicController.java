package com.plat.controller;

import javax.annotation.Resource;

import com.google.gson.Gson;
import com.plat.service.test.UserService;

public class BasicController {

	protected Gson gson = new Gson();
	@Resource
	protected UserService userService;
}
