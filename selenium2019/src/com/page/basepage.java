package com.page;

import com.util.util;

public class basepage extends util{
	//ÌøÖÁ×ó±ß¿ò¼Ü
public void zuob() {
	driver.switchTo().frame(1);
}
//ÌøÖÁÄ¬ÈÏ¿ò¼Ü
public void tiaoc() {
	driver.switchTo().parentFrame();
}

//ÌøÖÁ×ó±ß¿ò¼Ü
public void youb() {
	 driver.switchTo().frame(2);
}	
	
}
