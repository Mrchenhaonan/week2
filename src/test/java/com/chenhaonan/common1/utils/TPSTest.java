package com.chenhaonan.common1.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.chenhaonan.common1.entity.TPS;
import com.chenhaonan.common1.utils.random.RandNumUtil;
import com.chenhaonan.common1.utils.string.ZHStringUtil;

import junit.framework.TestCase;

public class TPSTest extends TestCase {
	public static <E> void main(String[] args) {
		TPS tps = new TPS();
		ArrayList<TPS> list = new ArrayList<TPS>();
		
		for (int i = 0; i < 100; i++) {//生成100个
			
			tps.setId(i+1);//给各标签设置值
			tps.setName(ZHStringUtil.getZHName());//设置名字
			tps.setAge(RandNumUtil.random(1, 100));//设置年龄
			tps.setQian(RandNumUtil.getValue(30000, 80000, 2));//钱
			Date date=randomDate("2012-0-01", "2020-04-27");//规定时间
			String d=(new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(date));
			tps.setRq(d);
			System.out.println(tps);
		}
		
	}
	private static Date randomDate(String beginDate,String endDate){//生成随机时间
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date start = format.parse(beginDate);
			Date end = format.parse(endDate);
			if(start.getTime()>=end.getTime()){
				return null;
			}
			long date=random(start.getTime(),end.getTime());
			return new Date(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	private static long random(long end, long begin) {
		// TODO Auto-generated method stub
		long rtn=begin+(long)(Math.random()*(end-begin));
		if(rtn==begin || rtn==end){
			return random(begin, end);
		}
		return rtn;
	}
}
