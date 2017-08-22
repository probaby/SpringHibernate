package com.hb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Deererer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Demo deo=(Demo)ctx.getBean("demo");
		deo.test();
	}
}
