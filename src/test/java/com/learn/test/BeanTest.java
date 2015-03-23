package com.learn.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.web.dao.UserDao;
import com.learn.web.entity.User;

public class BeanTest {
	
	ApplicationContext applicationContext;
	
	@Before
	public void init(){
			try {
				
				applicationContext = new ClassPathXmlApplicationContext("spring-mvc.xml");
				Assert.assertNotNull(applicationContext);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
	}
	
	
	@Test
	public void testBean(){
		User user = applicationContext.getBean(User.class);
		Assert.assertNotNull(user);
	}
	
	
	@Test
	public void testDao() throws SQLException{
		UserDao userDao = applicationContext.getBean(UserDao.class);
		List<User> users = userDao.findList();
		Assert.assertNotEquals(users.size(),0);
		System.out.println(users.size());
	}
	
}
