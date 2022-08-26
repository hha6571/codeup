package codeup_basic;

import java.util.Scanner;

public class First_001 {

		
		public void test01() {
		// 001. 정수 1개 입력받아 그대로 출력하기
		
		System.out.println("정수를 1개 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.printf("%d", num);
		
		sc.close();
		
		}
		
		public void test02() {
		// 002. 문자 1개 입력받아 그대로 출력하기 
		
		System.out.println("문자 1개를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		System.out.printf("%c", ch);
		
		sc.close();
		
		}
		
		public void test03() { 
		// 003. 실수 1개 입력받아 그대로 출력하기 
		
		System.out.println("실수 1개를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
				
		float x = sc.nextFloat();
		
		System.out.printf("%f", x);
		
		sc.close();
		
		}
		
		public void test04() {
		// 004. 정수 2개 입력받아 그대로 출력하기
		
		System.out.println("정수 2개를 입력하세요.");
		
		System.out.println("정수1 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		
		
		System.out.printf("%d %d", num1, num2);
		
		sc.close();
		}
		
		public void test05() {
		// 005. 문자 2개입력받아 순서 바꿔 출력하기
		
		char x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 2개를 입력하세요.");
		System.out.println("문자 1 : ");
		char ch1 = sc.next().charAt(0);
		System.out.println("문자 2 : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.printf("%c %c", ch2, ch1);
		
		sc.close();
		
		}

		public void test06() {
		// 006. 실수 입력받아 둘째 자리까지 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요 : ");
		float num = sc.nextFloat();
		
		System.out.printf("%.2f", num);
		
		sc.close();
		
		}
		
		
		public void test07() {
		// 007. 정수 1개 입력받아 3번 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.printf("%d %d %d", num, num, num);
		
		sc.close();
		
		}
		
		public void test08() {
		// 008. 시간 입력받아 그대로 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요. 시 :  ");
		int hour = sc.nextInt();
		System.out.println("시간을 입력하세요. 분 :  ");
		int min = sc.nextInt();
		
		System.out.printf("%d:%d", hour, min);
		
		sc.close();
		}
		
		
		public void test09() {
		// 009. 년, 월, 일을 입력받아 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년 : ");
		String year = sc.next();
		System.out.println("월 : ");
		String month = sc.next();
		System.out.println("일 : ");
		String day = sc.next();
		
		System.out.printf("%s년 %s월 %s일", year, month, day);
		
		sc.close();
	}
		public void test10() {
			// 010. 시분초 입력받아 분만 출력하기
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("시간을 입력하세요 (예 ) 12:23:12 ) : ");
			String str = sc.next();
			String[] arr = str.split(":");
			
			System.out.println("분 : "+ arr[1]);
			
			sc.close();
		}
}
