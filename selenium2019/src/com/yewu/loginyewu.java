package com.yewu;

import com.page.loginpage;
import com.util.util;

public class loginyewu extends util {
	//����ַ
	public void openurl() {
		driver.get(url);
	}
	public void login() throws InterruptedException {
    //��������
	loginpage page=new loginpage();
	//��¼�Ĳ���
	page.username();
	page.pwd();
	page.lx();
	Thread.sleep(10000);
	page.dlan();
}

	
}