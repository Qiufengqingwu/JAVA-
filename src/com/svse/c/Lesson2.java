package com.svse.c;

import java.util.ArrayList;
import java.util.List;

public class Lesson2 {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	//获得0-3之间的随机数
	int i = (int)(Math.random()*(list.size()));
	System.out.println("随机获取数组中的元素"+list.get(i));
	//将指定索引位置的元素从集合中移除
	list.remove(2);
	System.out.println("将指定位置的元素从元素中移除 ，数组的元素是");
	//循环便利集合
	for(int j=0;j<list.size();j++){
		System.out.println(list.get(j));
	}
  }
}
