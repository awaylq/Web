package com.plat.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.plat.pojo.User;
import com.plat.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class ServiceTest {
	private static Logger logger = Logger.getLogger(ServiceTest.class);
	@Resource
	private UserService userService = null;

	@Test
	public void test() {
		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		Gson gson = new Gson();

		logger.info(gson.toJson(user));
	}
}
