package com.java.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		System.out.print("���� : ");
		int a = sc.nextInt();
		System.out.print("���� : ");
		int b = sc.nextInt();
		System.out.print("���� : ");
		int c = sc.nextInt();
		System.out.print("���� : ");
		int d = sc.nextInt();
		System.out.print("���� : ");
		int e = sc.nextInt();
		
		if(a>b && a>c && a>d && a>e ) {
			System.out.println("��밪�� "+a+"�Դϴ�.");
			}
		
		else if(b>a && b>c && b>d && b>e ) {
			System.out.println("��밪�� "+b+"�Դϴ�.");
			}
		
		else if(c>a && c>b && c>d && c>e ) {
			System.out.println("��밪�� "+c+"�Դϴ�.");
			}
		
		else if(d>a && d>b && d>c && d>e ) {
			System.out.println("��밪�� "+d+"�Դϴ�.");
			}
		
		else if(e>a && e>b && e>c && e>d ) {
			System.out.println("��밪�� "+e+"�Դϴ�.");
			}
		sc.close();
		
		
		
		

	}

}
