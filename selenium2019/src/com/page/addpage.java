package com.page;

import org.openqa.selenium.By;

import com.util.util;

public class addpage extends util {
	
	public void tiku() {
		driver.switchTo().frame(1);
		  driver.findElement(By.linkText("题库管理")).click();
		  driver.findElement(By.linkText("新增题库")).click();
	}
	public void kuming() {
		  driver.switchTo().parentFrame();
		  driver.switchTo().frame(2);
		  driver.findElement(By.name("d_name")).sendKeys("mysql");
	}
	public void tijiao() {
		  driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
		  
	}

}
