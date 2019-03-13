package com.testcase;

import org.testng.annotations.Test;

import com.util.util;
import com.yewu.addyewu;
import com.yewu.loginyewu;


public class addtestcase extends util{
	@Test
	public void add() throws InterruptedException {
		loginyewu yewu2=new loginyewu();
		addyewu yewu=new addyewu();
		yewu2.openurl();
		yewu2.login();
		yewu.add();
		
		
	}
}
