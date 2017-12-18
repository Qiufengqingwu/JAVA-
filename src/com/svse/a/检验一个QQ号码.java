package com.svse.a;

import java.util.Scanner;

public class 检验一个QQ号码 {
	public static void main(String[] args) {
		System.out.println("请输入你的QQ号码");
		Scanner sc = new Scanner(System.in);
		String qq = sc.nextLine();
		System.out.println("cheQQ:" + cheQQ(qq));

	}

	public static boolean cheQQ(String qq) {
		boolean flag = true;
		// 校验长度
		if (qq.length() > 5 && qq.length() < 11) {
			// 0不能开头
			if (!qq.startsWith("0")) {
				// 必须是数字
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
