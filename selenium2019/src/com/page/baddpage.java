package com.page;

import org.openqa.selenium.By;

import com.util.util;

public class baddpage extends util{
	//���ѧ������
public void xuesgl() {
	driver.findElement(By.linkText("ѧ������")).click();
	
}
//����༶����
public void banjgl() {
	driver.findElement(By.linkText("�༶����")).click();
}
//��������༶
public void addbj() {
	driver.findElement(By.linkText("�����༶")).click();
}
//������������
public void jgmc(String s) {
	driver.findElement(By.name("b_name")).sendKeys(s);
}
//�ύ
public void addxzbtj() {
	 driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
}



}
