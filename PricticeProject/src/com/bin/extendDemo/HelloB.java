package com.bin.extendDemo;

public class HelloB extends HelloA {
	public HelloB(){
		System.out.println("Hello B");
	}
	{
		System.out.println("I am B class");
	}
	static {
		System.out.println("Static : B");
	}
	public static void main(String[] args) {
		new HelloB();
		//HelloA ha = new HelloB();
	}
}
