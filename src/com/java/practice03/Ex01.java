package com.java.practice03;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println("while문");
		int index = 0;
		while( index<3 ) {
			System.out.println("index="+ index);
			index++; // 증감식을 안써줬기 때문에 for문으로 빠져나가지 못하고 0이 반복된다.
		}
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order+"+order);
		}
	
	
	
	}

}
