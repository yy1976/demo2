package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.util;

public class loginpage extends util {
	
	/*
	 * ����ҳ��
	 * */
 //�û�������
	public void username() {
		driver.findElement(By.name("username")).sendKeys("hujianming");//��λ�û�������򣬲�����
	}
	//����
	public void pwd() {
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");//��λ��������򣬲�����
	}
	//����ѡ��
	public void lx() {
		new Select(driver.findElement(By.name("usertype"))).selectByIndex(2);
	}
	//��¼
		public void dlan() {
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();//��λ���밴ť�����
		}
	
	
}
