package com.javaex.ex03;

public class Ex02 {

	public static void main(String[] args) {

		//for반복문 연습문제(중첩 반복문)
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			sum=i+sum;
			System.out.println(i+"까지의 합은 "+sum);
		}
		System.out.println("1부터 10까지의 정수의 합은 "+sum+" 입니다.");
	}

}
