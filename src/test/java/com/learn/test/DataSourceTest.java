package com.learn.test;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.web.dao.UserDao;
import com.learn.web.entity.User;

public class DataSourceTest {

	ApplicationContext context;
	ApplicationContext beanContext;
	
	
	@Before
	public void init(){
		try {
			context = new ClassPathXmlApplicationContext("applicationContext-spring.xml");
			beanContext = new ClassPathXmlApplicationContext("spring-mvc.xml");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testDataSouce() throws SQLException{
		DataSource dataSource = context.getBean("baseDataSource", DataSource.class);
		Assert.assertNotNull(dataSource);
		System.out.println("conncted!!!");
	}
	
	
	@Test
	public void testDao() throws SQLException{
		UserDao userDao = beanContext.getBean(UserDao.class);
		List<User> users = userDao.findList();
		Assert.assertNotEquals(users.size(),0);
		System.out.println(users.size());
	}
	

}
