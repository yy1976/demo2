package com.yewu;

import com.page.loginpage;
import com.util.util;

public class loginyewu extends util {
	//打开网址
	public void openurl() {
		driver.get(url);
	}
	public void login() throws InterruptedException {
    //声明变量
	loginpage page=new loginpage();
	//登录的操作
	page.username();
	page.pwd();
	page.lx();
	Thread.sleep(10000);
	page.dlan();
}

	
}