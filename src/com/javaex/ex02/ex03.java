package com.javaex.ex02;

import java.util.Scanner;

public class ex03 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.c 3.c++ 4.파이썬)");
		System.out.print("과목번호: ");
		int code=sc.nextInt();
		
		if(code==1) {
			System.out.println("R101호 입니다.");
		} else if(code==2) {
			System.out.println("R202호 입니다.");
		} else if(code==3) {
			System.out.println("R303호 입니다.");
		} else if(code==4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		sc.close();
	}	
}
