package com.leran.test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.web.entity.User;

public class BeanTest extends TestCase {
	
	ApplicationContext applicationContext;
	
	@Before
	public void initContext(){
		try {
			
			applicationContext = new ClassPathXmlApplicationContext("spring-mvc.xml");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Test
	public void test11(){
		assertNotNull(applicationContext);
	}
	
	
	@Test
	public void testBean(){
		User user = applicationContext.getBean(User.class);
		user.setTest("adfasdf");
		System.out.println(user.getTest());
		/*assertNotNull(user);*/
	}
	
}
