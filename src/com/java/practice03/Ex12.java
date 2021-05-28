package com.java.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.hashCode();
		
		
		for(int x=a-1; x>0; x--) {
			System.out.println(a+x);
		}
		
		
		
		
		
		sc.close();
	
	
	
	}

}
