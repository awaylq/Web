package com.plat.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.plat.pojo.User;
import com.plat.service.UserService;

@Controller
@RequestMapping("test")
public class TestController {
	@Resource
	private UserService userService;

	@RequestMapping("/select")
	@ResponseBody
	public String getUserById(HttpServletRequest request) {

		String a = request.getParameter("id");
		int id = Integer.parseInt(a);
		User user = userService.getUserById(id);
		Gson gson = new Gson();
		return gson.toJson(user);

	}

	@RequestMapping("/")
	@ResponseBody
	public String test() {
		Gson gson = new Gson();
		return gson.toJson("1234");
	}

}
