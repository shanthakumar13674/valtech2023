package com.valtech.training.firstspringboot.components;

public class ArithmeticImpl implements Arithmetic	{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}
	

	public static void main(String[] args) {
		Arithmetic a = new ArithmeticImpl();
		System.out.println(a.add(2, 3));
		try {
			System.out.println(a.div(5, 1));
			System.out.println(a.div(5, 5));
		}catch (Exception e) {
			System.out.println("Will this be seen....");
		}finally	{
			System.out.println("Seen Always");
		}
		System.out.println(a.mul(4, 2));
	}
}

















