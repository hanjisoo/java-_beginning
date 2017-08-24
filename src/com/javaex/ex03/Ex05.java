package com.javaex.ex03;


public class Ex05 {
	public static void main(String[]args) {
		
		
		/*for(int dan=2; dan<10; dan++) {
		
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		    continue;
		}*/ //문제 구구단출력
		
		int y;          //별삼각형만드는 문제
		int x;
		for( y=1; y<7; y++) {
			for( x=1; x<=y; x++) {
			System.out.print("*");
			}
			System.out.println(" ");
		   continue;
		}
	}
	
}
