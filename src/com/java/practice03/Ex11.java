package com.java.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		
		if(a%2 != 0) {
			for(int b=1; b<=a; b++) {
				if(b%2 != 0) {
					sum = sum+ b;
				
				}
			
			}
			System.out.println("����� : " + sum);
		}
		
		
		else if(a%2 == 0) {
			for(int c=1 ; c<=a; c++) {
				if(c%2 == 0) {
					sum2 = sum2 + c;
				}
			}
			System.out.println("����� : " + sum2);
		}		
		
		
		
		
		
		
		
		
		
		sc.close();
	
	
	
	
	}

}
