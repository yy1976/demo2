package com.yewu;

import com.page.basepage;
import com.page.gonggaopage;
import com.util.util;

public class gonggaoyewu extends util{
	public void add() {
		gonggaopage gonggao=new gonggaopage();
		basepage base=new basepage();
		//新增公告的操作
		base.zuob();
		gonggao.guanli();
		gonggao.liebiao();
		base.tiaoc();
		base.youb();
		gonggao.xinzeng();
		gonggao.bt();
		gonggao.submit1();
	}
}
