package com.svse.d;

public class Demo2 {
public static void main(String[] args) {
	ObjectTool ot = new ObjectTool();
	ot.setObj(new String("������"));
	String s= (String) ot.getObj();
	System.out.println("������:"+s);
	ot.setObj(new Integer(30));
	Integer a= (Integer) ot.getObj();
	
	System.out.println("  age:"+a);
}}
