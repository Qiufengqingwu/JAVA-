package com.svse.c;
import java.util.*;

public class Lesson1 {
public static void main(String[] args) {
	//ʵ����������
	Collection<String> list = new ArrayList<String>();
	
	//�򼯺������Ԫ��
	list.add("a");
	list.add("b");
	list.add("c");
	//����������
	Iterator<String> it= list.iterator();
	//����ѭ��
	while(it.hasNext()){
		String str = it.next();
		System.out.println(str);
	}
}}