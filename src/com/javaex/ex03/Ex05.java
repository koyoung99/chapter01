package com.javaex.ex03;

public class Ex05 {

	public static void main(String[] args) {

		//for반복문 vs while반복문
		
		int i = 1;

		while (true) {
			if (i % 6 == 0 && i % 14 == 0)

			{
				break;
			} else {
				i++;
			}

		}
		System.out.println(i);

	}

}
