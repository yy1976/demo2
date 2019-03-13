package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.util;

public class loginpage extends util {
	
	/*
	 * 登入页面
	 * */
 //用户名输入
	public void username() {
		driver.findElement(By.name("username")).sendKeys("hujianming");//定位用户名输入框，并输入
	}
	//密码
	public void pwd() {
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");//定位密码输入框，并输入
	}
	//类型选择
	public void lx() {
		new Select(driver.findElement(By.name("usertype"))).selectByIndex(2);
	}
	//登录
		public void dlan() {
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();//定位登入按钮并点击
		}
	
	
}
