package com.svse.a;

import java.util.Scanner;

public class 正规表达式 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入你的qq号码");
	String qq= sc.nextLine();
	System.out.println("check:"+check(qq));
	
}
public static boolean check(String qq){
//	String reget="[1-9][0-9]{4,14}";
//	boolean flag= qq.matches(reget);
//	return flag;
//	下面这个与上面注销的功能一样简写化了
	return qq.matches("[1-9][0-9]{4,14}");
	
}
}
