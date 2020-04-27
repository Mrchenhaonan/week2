package com.chenhaonan.common1.utils.string;

import junit.framework.TestCase;

public class ZHStringUtilTest extends TestCase {//单元测试

	public void testGetZHString() {
		String zhString = ZHStringUtil.getZHString();
		System.out.println(zhString);
	}

	public void testGetZHStringInt() {
		String zhString = ZHStringUtil.getZHString(3);
		System.out.println(zhString);
	}

	public void testGetZHName() {
		String zhName = ZHStringUtil.getZHName();
		System.out.println(zhName);
	}

}
