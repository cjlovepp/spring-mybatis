package com.learn.web.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import com.learn.web.dao.UserDao;
import com.learn.web.entity.User;


/**
 * @author: chenjing
 * @description: 
 * 2015年3月23日
 */
public class UserDaoImpl implements UserDao {


	protected SqlSession sqlSessionTemplate;
	
	@Override
	public List<User> findList() {
		// TODO Auto-generated method stub
		
		return sqlSessionTemplate.selectList("com.learn.web.entity.User.findAll");
	}

}
