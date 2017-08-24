package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[]args) {
	
		/*Scanner sc =new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name= sc.nextLine();
		System.out.println("당신의 이름은 "+name+"입니다.");*/
				
		
		
	   /*Scanner sc= new Scanner(System.in);//키보드랑 연결하고 sc가 대기
	   System.out.println("숫자를 입력해주세요.");//출력했고
	   System.out.print("숫자: "); //print니깐 옆에 마우스커서있음
	   int num = sc.nextInt();    //우리가 만든 num에 sc에서 나온 숫자를 넣어주겠다.
	                              //이상태에서 대기 
	   System.out.println("입력하신 숫자는 "+num+" 입니다.");//num+숫자 하면 더해져서 결과 나옴
	   
	   
	   sc.close();//닫아놓음*/	  
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int num=sc.nextInt();
		System.out.println("당신의 이름은"+name+"나이는"+num+"입니다");
				
		
	}
}
