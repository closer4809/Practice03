package com.java.practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		int a = sc.nextInt();
		
		for(int y=a; y>0; y--) {
			for(int x=1; x<=y; x++) {
				System.out.print("*");
		}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	
	}

}
