package com.svse.a;

import java.util.Scanner;

public class ������ʽ {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("���������qq����");
	String qq= sc.nextLine();
	System.out.println("check:"+check(qq));
	
}
public static boolean check(String qq){
//	String reget="[1-9][0-9]{4,14}";
//	boolean flag= qq.matches(reget);
//	return flag;
//	�������������ע���Ĺ���һ����д����
	return qq.matches("[1-9][0-9]{4,14}");
	
}
}
