package com.svse.c;
import java.util.*;

public class Lesson1 {
public static void main(String[] args) {
	//实例化集合类
	Collection<String> list = new ArrayList<String>();
	
	//向集合类添加元素
	list.add("a");
	list.add("b");
	list.add("c");
	//创建迭代器
	Iterator<String> it= list.iterator();
	//遍历循环
	while(it.hasNext()){
		String str = it.next();
		System.out.println(str);
	}
}}