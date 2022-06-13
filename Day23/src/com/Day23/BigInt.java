package com.Day23;

import java.math.BigInteger;

public class BigInt {
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(10);
		BigInteger b = BigInteger.valueOf(20);
		BigInteger d = new BigInteger("5555");
		BigInteger c = a.add(b).add(d);
		System.out.println(c);
		
	}

}
