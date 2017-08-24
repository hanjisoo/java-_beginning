package com.javaex.ex04;

public class Ex01 {
	public static void main(String[]args) {
	
		int[] noArr=new int[6];
		
		/*noArr[0]=(int)(Math.random()*45)+1; //임의의 수가들어가
		noArr[1]=(int)(Math.random()*45)+1;
		noArr[2]=(int)(Math.random()*45)+1;
		noArr[3]=(int)(Math.random()*45)+1;
		noArr[4]=(int)(Math.random()*45)+1;
		noArr[5]=(int)(Math.random()*45)+1;*/
		
		for(int i=0; i<6; i++) {
			noArr[i]=(int)(Math.random()*45)+1;
		}          //위아래 둘다 변수i로 잡았는데 for문 괄호내에서 끝나니깐 괜찮아.
		
		/*System.out.print(noArr[0]+" ");
		System.out.print(noArr[1]+" ");
		System.out.print(noArr[2]+" ");
		System.out.print(noArr[3]+" ");
		System.out.print(noArr[4]+" ");
		System.out.print(noArr[5]+" ");*/
		
		for(int i=0; i<6; i++) {   //i<noArr.length;
			System.out.print(noArr[i]+" ");
		}
		
		/*int no=(int)(Math.random()*45)+1;   //내가 끄적인거
		int[] intArray=new int[45];
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		intArray[3]=4;
		intArray[4]=5;
		intArray[5]=6;
		for( no=0; no<45; no++) {
			System.out.println(intArray[no]);
		}*/
		
	}
}
