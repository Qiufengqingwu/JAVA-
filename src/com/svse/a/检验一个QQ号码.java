package com.svse.a;

import java.util.Scanner;

public class ����һ��QQ���� {
	public static void main(String[] args) {
		System.out.println("���������QQ����");
		Scanner sc = new Scanner(System.in);
		String qq = sc.nextLine();
		System.out.println("cheQQ:" + cheQQ(qq));

	}

	public static boolean cheQQ(String qq) {
		boolean flag = true;
		// У�鳤��
		if (qq.length() > 5 && qq.length() < 11) {
			// 0���ܿ�ͷ
			if (!qq.startsWith("0")) {
				// ����������
				char[] chs = qq.toCharArray();
				for (int x = 0; x < chs.length; x++) {
					char ch = chs[x];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}

			}else
			{
				flag = false;
			}

		} else {
			flag = false;
		}
		return flag;
	}
}
