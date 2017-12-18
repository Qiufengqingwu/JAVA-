package com.svse.a;
/*
 * StringBuffer删除功能
 */
public class StringBufferdemo2 {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	//添加功能
	sb.append("Hello").append("word").append("java");
	System.out.println("sb:"+sb);
	//删除功能 需求删除e这个字符
	
//   sb.deleteCharAt(1);
//   System.out.println("sb1"+sb);
//	
	//需求删除word这个字符串5第五个到第九个字符串
	sb.delete(5, 9);
	System.out.println("sb2:"+sb);
	//删除所字符串
	sb.delete(0,sb.length());
	System.out.println("sb3:"+sb);
}
}
