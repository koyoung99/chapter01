package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		// 반복문 연습문제

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요");

			int num = sc.nextInt();
			if (num % 3 == 0 && num!=0) {
				System.out.println("3의 배수입니다.");
			}else if(num%3!=0) {
				System.out.println("3의 배수가 아닙니다.");
			}else if(num==0) {
				System.out.println("종료");
				break;
			}
		}
		sc.close();
	}

}
