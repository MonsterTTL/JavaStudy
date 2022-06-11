package com.exercise.Day21 ;//必须是第一条有效的语句，每个Java文件都只有一个包
import java.util.*;//*代表通配符，他会到改包下挨个匹配，匹配上就导入
public class PackageTest {
	public static void main(String[] args) {
		String[] infor = {"Hello","The","World!"};
		Arrays.sort(infor);
		System.out.println(Arrays.toString(infor));
		Arrays.sort(infor,new Comp());
		System.out.println(Arrays.toString(infor));
		
	}
}

class Comp implements Comparator<String>{
	public int compare(String a1, String a2) {
		return (a1.length() - a2.length());
		}
	
}