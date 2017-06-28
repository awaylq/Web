package com.plat.controller.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plat.controller.BasicController;
import com.plat.pojo.test.User;

@Controller
@RequestMapping("main")
public class TestController extends BasicController {
	@RequestMapping("/select")
	@ResponseBody
	public String getUserById(HttpServletRequest request) {

		String a = request.getParameter("id");
		int id = Integer.parseInt(a);
		User user = userService.getUserById(id);
		return gson.toJson(user);

	}
}
