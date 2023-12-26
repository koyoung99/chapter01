package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {

		final double PI = 3.14; // final 상수(고정) 값을 변경할 수 없음.(대문자로 표기)
		System.out.println(PI);
		// PI=5; 변경안됨

		// 원의 넓이
		double cir_area = PI * 5 * 5;
		System.out.println(cir_area);

	}

}
