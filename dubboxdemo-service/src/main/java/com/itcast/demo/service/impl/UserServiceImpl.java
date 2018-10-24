package com.itcast.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itcast.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "itcast";
	}

}
