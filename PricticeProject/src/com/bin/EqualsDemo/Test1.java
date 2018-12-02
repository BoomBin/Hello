package com.bin.EqualsDemo;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		int i=0;
		List<Integer> list = new ArrayList<Integer>();
		add(i,list);
		System.out.println(i);
		for(Integer value:list) {
			System.out.println(value);
			
		}
	}
	
	static void add(int param,List<Integer> list) {
		param++;
		list.add(param);
	}
}
