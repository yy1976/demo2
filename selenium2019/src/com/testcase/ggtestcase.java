package com.testcase;

import org.testng.annotations.Test;

import com.util.util;
import com.yewu.gonggaoyewu;
import com.yewu.loginyewu;

public class ggtestcase extends util{
	@Test
	public void gonggao() throws InterruptedException{
	loginyewu yewu1=new loginyewu();
	gonggaoyewu yewu2=new gonggaoyewu();
	yewu1.openurl();
	yewu1.login();
	yewu2.add();
	}
}
