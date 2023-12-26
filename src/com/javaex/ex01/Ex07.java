package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {

		// 자동형변환
		int var0 = 3 + 5;
		System.out.println(var0);

		int a = 3;
		double b = 3.5;
		double var1 = a + b;
		System.out.println(var1);

		float var2 = 3 + 3.5f;
		System.out.println(var2);

		// 강제형변환
		float var3 = 1111.4345f;
		int var4 = (int) var3;
		System.out.println(var3);
		System.out.println(var4);

		// 축소형변환
		int num0 = 10;
		byte num1 = (byte) num0;
		System.out.println(num1);

		int num2 = 20302970;
		byte num3 = (byte) num2;
		System.out.println(num3);

		// 확대형변환
		byte num4 = 127;
		int num5 = (int) num4;
		System.out.println(num5);

		// 실수=>정수
		double x = 5.57;
		int y = (int) x;
		System.out.println(y);

		// 정수=>실수
		int z = 7;
		double q = (double) z;
		System.out.println(q);

	}

}
