package com.page;

import com.util.util;

public class basepage extends util{
	//������߿��
public void zuob() {
	driver.switchTo().frame(1);
}
//����Ĭ�Ͽ��
public void tiaoc() {
	driver.switchTo().parentFrame();
}

//������߿��
public void youb() {
	 driver.switchTo().frame(2);
}	
	
}
