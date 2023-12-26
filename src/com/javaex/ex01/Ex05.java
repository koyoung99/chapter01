package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {

		char ch01 = 'A';
		char ch02 = '앙';
		System.out.println(ch01);
		System.out.println(ch02);

		char ch03 = 65;
		System.out.println(ch03);

		char ch04 = '3'; // ""쌍따음표는 안됨
		System.out.println(ch04);

		char ch05 = '황'; // 두글자 이상 안됨
		System.out.println(ch05);

		String str = "안녕하세요"; // 한글자 이상(공백포함)
		System.out.println(str);
	}

}
