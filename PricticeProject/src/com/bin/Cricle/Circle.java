package com.bin.Cricle;

public class Circle {
	//存放圆的半径
	private double radius;
	
	//将半径设置为0
	Circle() {
		radius = 0.0;
	}
	
	//创建Circle对象时将半径初始化为r
	Circle(double r) {
		radius=r;
	}
	
	//获取圆的面积
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	//获取圆的周长
	public double getPerimeter() {
		
		return 2*Math.PI*radius;
	}
	
	//将圆的半径、周长、面积输出到屏幕
	public void show() {
		System.out.println("圆的半径是："+radius);
		System.out.println("圆的周长是："+getPerimeter());
		System.out.println("圆的面积是："+getArea());
	}
}
