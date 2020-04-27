package com.chenhaonan.common1.utils.random;

import java.math.BigDecimal;
import java.util.Random;

import junit.framework.TestCase;

public class RandNumUtilTest extends TestCase {//单元测试

	public void testGetValue() {
		BigDecimal value = RandNumUtil.getValue(21.58, 99.999, 2);
		System.out.println(value);
	}

	public void testRandom() {
		
		int r = RandNumUtil.random(2, 5);
		System.out.println(r);
	}

}
