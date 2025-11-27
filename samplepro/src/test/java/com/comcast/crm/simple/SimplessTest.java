package com.comcast.crm.simple;

import org.testng.annotations.Test;

public class SimplessTest {
	@Test
	public void simples()
	{
		String url= System.getProperty("url");
		String Browser= System.getProperty("browser");
		String username= System.getProperty("username");
		String passward= System.getProperty("passward");
		
		System.out.println(url);
		System.out.println(Browser);
		System.out.println(username);
		System.out.println(passward);
		
		
	}
	

}
