package com.exercise.Day21 ;//�����ǵ�һ����Ч����䣬ÿ��Java�ļ���ֻ��һ����
import java.util.*;//*����ͨ��������ᵽ�İ��°���ƥ�䣬ƥ���Ͼ͵���
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