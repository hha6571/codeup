package codeup_basic;

import java.util.Scanner;

public class Codeup_20220826_2 {

	public void test11() {
		// 011. 주민번호 입력받아 형태 바꿔 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하세요.  : ");
		
		String[] str = sc.next().split("-");
		
		System.out.println(str[0]+str[1]);
	}
	
	public void test12() {
		
		// 012. 10진수를 입력받아 8진수로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.  : ");
		
		int num = sc.nextInt();
		
		System.out.printf("%o", num);
	}
	
	public void test13() {
		// 013. 10진수를 입력받아 8진수로 출력
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("숫자를 입력하세요.  : ");
				
		int num = sc.nextInt();
				
		System.out.printf("%x", num);
		
	}
	
	public void test14() {
//		// 014. 영문자1개를 입력받아 10 진수로 출력하기
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("영문자를 입력하세요.  : ");
				
		char ch = sc.next().charAt(0);
		
		System.out.println((int)ch);
		
	}
	
	public void test15() {
		// 015. 정수를 아스키 문자로 출력하기
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("정수를 입력하세요.  : ");
				
		int num = sc.nextInt();
		
		System.out.println((char)num);
		
	}
	
	
	
	public void test16() {
		// 016. 정수2개를 입력받아 합 출력하기
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("정수1  : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수2  : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);
		
	}
	
	public void test17() {
		// 017. 정수2개를 입력받아 합 출력하기 ( 한번에 )
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요.(띄어쓰기로 구분)  : ");
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		
		
		System.out.println(num1+num2);
		
	}
	
	public void test18() {
		// 018. 정수1개를 부호바꿔 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한 개를 입력하세요. : ");
		int num = sc.nextInt();

		System.out.printf("%d", -num);
		
	}
	
	public void test19() {
		// 019. 문자1개 입력받아 다음 문자 출력하기 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1개를 입력하세요  : ");
		char ch = sc.next().charAt(0);
		char nextCh = (char)(ch+1);
		
		System.out.println(nextCh);
		
	}
	
	public void test20() {
		// 020. 정수 2개 입력받아 나눈 몫 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수  2개를 입력하세요  : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		System.out.println("a를 b로 나눈 몫 : "+num1/num2);
	}
	
}
