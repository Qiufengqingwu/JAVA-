package com.svse.a;
/*
 * StringBufferɾ������
 */
public class StringBufferdemo2 {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	//��ӹ���
	sb.append("Hello").append("word").append("java");
	System.out.println("sb:"+sb);
	//ɾ������ ����ɾ��e����ַ�
	
//   sb.deleteCharAt(1);
//   System.out.println("sb1"+sb);
//	
	//����ɾ��word����ַ���5��������ھŸ��ַ���
	sb.delete(5, 9);
	System.out.println("sb2:"+sb);
	//ɾ�����ַ���
	sb.delete(0,sb.length());
	System.out.println("sb3:"+sb);
}
}
