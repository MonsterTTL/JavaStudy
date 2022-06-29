package com.Day31;

import java.io.IOException;

public class Demo2_Runtime {
		
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();//获取运行时对象
		r.exec("shutdown -a");
		
		
		System.out.println(r);
	}

}
