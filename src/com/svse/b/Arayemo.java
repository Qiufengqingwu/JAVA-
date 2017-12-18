package com.svse.b;

import java.io.File;
import java.util.ArrayList;

public class Arayemo {
	
	public  void addElements(){
		ArrayList<Object> alist = new ArrayList<Object>();
		alist.add("test");
		alist.add(new Integer(1));
	alist.add(new File("C;\\"));
	alist.add(0, new Character('a'));
		alist.addAll(alist);
		for(Object obj:alist){
			System.out.println(obj.toString());
		}
		alist.clear();
	}
	public static void main(String[] args) {
		Arayemo am = new Arayemo();
		am.addElements();
	}
}
