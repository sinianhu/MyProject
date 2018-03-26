package com.cn.snh.dao;

import java.util.List;

import com.cn.snh.pojo.User;

public interface  UserDao {
	
	public List<User> selectByPrimaryKey(Integer id);
	
}
