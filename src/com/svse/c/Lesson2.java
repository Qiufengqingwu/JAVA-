package com.svse.c;

import java.util.ArrayList;
import java.util.List;

public class Lesson2 {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	//���0-3֮��������
	int i = (int)(Math.random()*(list.size()));
	System.out.println("�����ȡ�����е�Ԫ��"+list.get(i));
	//��ָ������λ�õ�Ԫ�شӼ������Ƴ�
	list.remove(2);
	System.out.println("��ָ��λ�õ�Ԫ�ش�Ԫ�����Ƴ� �������Ԫ����");
	//ѭ����������
	for(int j=0;j<list.size();j++){
		System.out.println(list.get(j));
	}
  }
}
