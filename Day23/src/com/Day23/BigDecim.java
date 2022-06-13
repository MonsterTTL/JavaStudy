package com.Day23;

import java.math.BigDecimal;

public class BigDecim {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal(1.1);
		BigDecimal bd2 = new BigDecimal(2.0);
		BigDecimal bd3 = bd2.subtract(bd1);
		System.out.println(bd3);
		
		BigDecimal bd4 = new BigDecimal("2.0");
		BigDecimal bd5 = new BigDecimal("1.1");
		BigDecimal bd6 = bd4.subtract(bd5);
		System.out.println(bd6);
		
		
	}

}
