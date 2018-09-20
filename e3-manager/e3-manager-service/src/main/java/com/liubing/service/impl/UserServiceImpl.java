package com.liubing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liubing.mapper.TbUserMapper;
import com.liubing.pojo.TbUser;
import com.liubing.pojo.TbUserExample;
import com.liubing.pojo.TbUserExample.Criteria;
import com.liubing.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper tbUserMapper;
	
	@Override
	public List<TbUser> getAllUser() {
		TbUserExample tbUserExample = new TbUserExample();
		Criteria criteria = tbUserExample.createCriteria();
		return tbUserMapper.selectByExample(tbUserExample);
	}

}
