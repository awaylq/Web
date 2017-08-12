package com.plat.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plat.user.pojo.User;
import com.plat.utils.BasicController;

@Controller
@RequestMapping("/user")
public class UserController extends BasicController {
	
	/**
	 * 查询全部用户信息
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/allUser")
	public String getUserById(HttpServletRequest request) {
		List<User> userList = userService.selectAll();
		System.out.println(gson.toJson(userList));
		return gson.toJson(userList);
//		return userList.toString();
	}
}
