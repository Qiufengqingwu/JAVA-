package com.svse.a;

public class StringBufferdemo3 {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	sb.append("heelo");
	sb.append("world");
	sb.append("java");
	//替换功能
	System.out.println("sb:"+sb);
	
	sb.replace(5, 10, "节日快乐");
	System.out.println("sb1:"+sb);
	
}
}
