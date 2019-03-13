package com.yewu;


import com.page.baddpage;
import com.page.basepage;
import com.util.util;

public class bjaddyewu extends util {
	public void bjadd() {
		baddpage bjadd=new baddpage();
		basepage base=new basepage();
		base.zuob();//跳到左边框架
		bjadd.xuesgl();//点击学生管理
		bjadd.banjgl();//点击班级管理
		base.tiaoc();//跳出框架
		base.youb();//跳到右边框架
		bjadd.addbj();//点击新增班级
		bjadd.jgmc("170305");//输入机构名称
		bjadd.addxzbtj();//点击提交
		}

}
