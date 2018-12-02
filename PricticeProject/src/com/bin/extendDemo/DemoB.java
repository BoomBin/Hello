package com.bin.extendDemo;

public class DemoB extends DemoA {
	int a = 2;
//	public DemoB(){
//		System.out.println("我是DemoB...");
//	}
	static {
		System.out.println("Hello DemoB");
	}
	public void say(){
		System.out.println("卧槽，你是B？...");
	}
	{System.out.println("我是DemoB...啦啦啦");}
	
	public static void main(String args[]) {
		DemoA da = new DemoB();
		da.say();
		//System.out.println(da.a);
	}
}
