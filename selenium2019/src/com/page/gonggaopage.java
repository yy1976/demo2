package com.page;

import org.openqa.selenium.By;


import com.util.util;

public class gonggaopage extends util {

	//公告管理
	public void guanli() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/h2/a")).click();
	}
	//公告列表
	public void liebiao() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a")).click();
	}
	//新增公告
	public void xinzeng() {
		driver.findElement(By.linkText("新增公告")).click();
	}
	//标题
	public void bt() {
		driver.findElement(By.name("n_title")).sendKeys("通知");
	}

	
	public void submit1() {
		driver.findElement(By.className("tm_btn tm_btn_primary")).click();
}
}
