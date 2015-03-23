package com.learn.web.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.learn.web.entity.User;


/**
 * @author: chenjing
 * @description: 
 * 2015年3月23日
 */
@Repository
public interface UserDao {
	
	public List<User> findList();
	
}
