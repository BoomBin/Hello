package com.bin.extendDemo;

public class DemoA {
	int a = 1;
	public DemoA() {
		System.out.println("卧槽你是谁?...");
		System.out.println("卧槽这你都不知道？我是："+this);
		
	}
	static {
		System.out.println("Hello DemoA");
	}
	public void say(){
		System.out.println("我是DemoA...");
	}
	{System.out.println("我是DemoA....啦啦啦");}
}
