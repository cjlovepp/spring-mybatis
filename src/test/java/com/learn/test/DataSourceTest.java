package com.learn.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceTest {

	ApplicationContext context;
	
	@Before
	public void init(){
		try {
			context = new ClassPathXmlApplicationContext("applicationContext-spring.xml");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testDataSouce() throws SQLException{
		DataSource dataSource = context.getBean("baseDataSource", DataSource.class);
		Assert.assertNotNull(dataSource);
	}

}
