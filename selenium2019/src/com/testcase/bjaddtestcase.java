package com.testcase;

import org.testng.annotations.Test;

import com.util.util;

import com.yewu.bjaddyewu;
import com.yewu.loginyewu;

public class bjaddtestcase extends util{
 
	@Test
	public void add() throws InterruptedException {
		loginyewu login=new loginyewu();
		bjaddyewu bjadd=new bjaddyewu();
		login.openurl();
		login.login();
	    bjadd.bjadd();
		
		
	}
}
