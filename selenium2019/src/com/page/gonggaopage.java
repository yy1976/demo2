package com.page;

import org.openqa.selenium.By;


import com.util.util;

public class gonggaopage extends util {

	//�������
	public void guanli() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/h2/a")).click();
	}
	//�����б�
	public void liebiao() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a")).click();
	}
	//��������
	public void xinzeng() {
		driver.findElement(By.linkText("��������")).click();
	}
	//����
	public void bt() {
		driver.findElement(By.name("n_title")).sendKeys("֪ͨ");
	}

	
	public void submit1() {
		driver.findElement(By.className("tm_btn tm_btn_primary")).click();
}
}
