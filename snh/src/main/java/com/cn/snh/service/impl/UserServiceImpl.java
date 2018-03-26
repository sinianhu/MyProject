package com.cn.snh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.snh.dao.UserDao;
import com.cn.snh.pojo.User;
import com.cn.snh.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource 
	private UserDao userDao;
	
	@Override
	public User getUserById(Integer id) {
		return userDao.selectByPrimaryKey(id).get(0);
	}

}
