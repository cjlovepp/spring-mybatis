package com.learn.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.web.entity.User;

public class BeanTest {
	
	ApplicationContext applicationContext;
	
	@Before
	public void init(){
			try {
				
				applicationContext = new ClassPathXmlApplicationContext("spring-mvc.xml");
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
	
}
