package com.java.practice03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		for(int y=a; y>=1; y--) {
			for(int x=y; x>=1; x--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int z=1; z<=a-1; z++) {
			for(int c=z; c<z; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		sc.close();
	
	}

}
