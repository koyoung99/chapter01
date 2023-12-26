package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {

		byte num1;
		num1 = -128;
		System.out.println(num1);

		int num2;
		num2 = 2147483647;
		System.out.println(num2);

		long num3 = 9223372036854775807L;
		// Long형은 int의 범위를 벗어난 값 뒤에 'L'을 붙힘
		System.out.println(num3);

		int var01, var02, var03;
		var01 = 10;
		var02 = 20;
		var03 = 30;
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);

		int var04 = 100, var05 = 200, var06 = 300;
		System.out.println(var04);
		System.out.println(var05);
		System.out.println(var06);

	}
}
