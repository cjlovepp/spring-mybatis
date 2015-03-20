package com.learn.web.entity;

import org.springframework.stereotype.Repository;

/**
 * @author ghost
 *
 */
@Repository
public class User {
	
	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	
}
