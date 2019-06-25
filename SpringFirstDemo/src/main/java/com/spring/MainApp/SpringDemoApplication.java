package com.spring.MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Pojo.Driver;

public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Driver d1= (Driver) context.getBean("driver1");
		
		System.out.println(d1.toString());
		
		Driver d2 = (Driver) context.getBean("driver2");
		System.out.println(d2.toString());
	}

}
