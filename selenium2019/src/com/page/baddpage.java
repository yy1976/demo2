package com.page;

import org.openqa.selenium.By;

import com.util.util;

public class baddpage extends util{
	//点击学生管理
public void xuesgl() {
	driver.findElement(By.linkText("学生管理")).click();
	
}
//点击班级管理
public void banjgl() {
	driver.findElement(By.linkText("班级管理")).click();
}
//点击新增班级
public void addbj() {
	driver.findElement(By.linkText("新增班级")).click();
}
//机构名称输入
public void jgmc(String s) {
	driver.findElement(By.name("b_name")).sendKeys(s);
}
//提交
public void addxzbtj() {
	 driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
}



}
