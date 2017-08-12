package com.plat.user.pojo;

import java.sql.Date;

/**
 * 表名user
 * 用户信息表
 * @author xjf
 */
public class User {
	//主键
	private Integer id;
	//登陆用户名
	private String userName;
	//登陆密码
	private String password;
	//手机号
	private String phone;
	//邮箱
	private String email;
	//真实姓名
	private String name;
	//身份证号
	private String id_card;
	//昵称
	private String nickname;
	//性别：1男，2女（默认为男）
	private int sex;
	//生日
	private Date birthday;
	//第三方登陆：1微信，2QQ，3新浪
	private int other_login;
	//创建时间（默认当前时间）
	private Date c_time;
	//最后修改时间
	private Date u_time;
	//是否删除：1未删除，2已删除（默认为未删除）
	private int is_delete;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String userName, String password, String phone, String email, String name, String id_card,
			String nickname, int sex, Date birthday, int other_login, Date c_time, Date u_time, int is_delete) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.name = name;
		this.id_card = id_card;
		this.nickname = nickname;
		this.sex = sex;
		this.birthday = birthday;
		this.other_login = other_login;
		this.c_time = c_time;
		this.u_time = u_time;
		this.is_delete = is_delete;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getOther_login() {
		return other_login;
	}

	public void setOther_login(int other_login) {
		this.other_login = other_login;
	}

	public Date getC_time() {
		return c_time;
	}

	public void setC_time(Date c_time) {
		this.c_time = c_time;
	}

	public Date getU_time() {
		return u_time;
	}

	public void setU_time(Date u_time) {
		this.u_time = u_time;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", phone=" + phone + ", email="
				+ email + ", name=" + name + ", id_card=" + id_card + ", nickname=" + nickname + ", sex=" + sex
				+ ", birthday=" + birthday + ", other_login=" + other_login + ", c_time=" + c_time + ", u_time="
				+ u_time + ", is_delete=" + is_delete + "]";
	}
}