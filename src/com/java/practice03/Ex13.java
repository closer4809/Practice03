package com.java.practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		int a = sc.nextInt();
			
		
		int c = 0;
		
		for(int b=0; b<=a; b++) {
			c = c + b;
		}
		
		System.out.print("�հ� : ");
		System.out.println(c);
		
		
		
		sc.close();
		
	}

}
