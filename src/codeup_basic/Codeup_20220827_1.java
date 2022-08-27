package codeup_basic;

import java.util.Scanner;

public class Codeup_20220827_1 {

	public void test31() {
		//31. 정수 1개 입력받아 카운트 다운 출력하기
		// 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1개를 입력하세요. : ");
		int num = sc.nextInt();
		
		for(int i = num; i>0; i--) {
			System.out.println(i);
		}
	}
	public void test32() {
		//32. 정수 1개 입력받아 카운트 다운 출력하기
		// 1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1개를 입력하세요. : ");
		int num = sc.nextInt() - 1;
		
		for(int i = num; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	public void test33() {
		//33. 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
		// 아스키코드를 이용하여 풀이하기
		// 102 >  97 98 99 100 101 102
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 소문자를 입력하세요. : ");
		int ascii = sc.nextLine().charAt(0);
		
		for(int i = 97; i <= ascii; i++){
			System.out.println((char)i);
		}
		
	}
	public void test34() {
		//34.정수 1개 입력받아 그 수까지 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1개를 입력하세요. : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++){
			System.out.println(i);
		}
		
	}
	public void test35() {
		//35. 정수1개를 입력받아 1부터 그 수까지 짝수의 합을 구하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1개를 입력하세요 : ");
		int num = sc.nextInt();
		int evenSum = 0;
		
		for(int i = 0; i <= num; i++) {
			if( i % 2 ==0) {
				evenSum += i;
			}
		}
		System.out.println(evenSum);
	}
}
