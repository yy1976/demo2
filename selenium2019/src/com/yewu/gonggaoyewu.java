package com.yewu;

import com.page.basepage;
import com.page.gonggaopage;
import com.util.util;

public class gonggaoyewu extends util{
	public void add() {
		gonggaopage gonggao=new gonggaopage();
		basepage base=new basepage();
		//��������Ĳ���
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
