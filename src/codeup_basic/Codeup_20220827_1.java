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
	
	public void test36() {
		//36. 원하는 문자가 입력될 때까지 반복 출력하기
		// 'q' 가 입력 될때까지 입력한 문자를 계속 출력하는 프로그램을 작성 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요 : ");
		
		String[] strr = sc.nextLine().split(" ");
		
		for( int i =0; i < strr.length; i++) {
			System.out.println(strr[i]);
			if( strr[i].equals("q")) {
				break;
			}
		}
	}
	
	public void test37() {
		// 37. 언제까지 더해야 할까?
		// 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
		// 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 0; 
		
		for(i =0; i <= num; i++) {
			sum += i;
			
			if( sum >= num ) {
				break;
			}
		}
		System.out.println(i);
	}
	
	public void test38() {
		// 38. 주사위를 2개 던지면 ?
		// 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다. 첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위의 범위를 입력하세요 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i =1; i <= n; i++) {
			for(int j= 1; j <= m; j++) {
				System.out.println(i +" "+  j);
			}
		}
	}
	
	public void test39() {
		//39. 16진수 구구단?
		//A, B, C, D, E, F 중 하나가 입력될 때, 1부터 F까지 곱한 16진수 구구단의 내용을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println(" A~F까지 하나를 입력하세요 : ");
		
		int num = sc.nextInt(16);
		
		for(int i = 1; i <16; i++ ) {
			System.out.printf("%x * %x = %x\n", num, i, num*i);
		}
	}
	
	public void test40() {
		// 40. 3 6 9 게임의 왕이 되자 !
		// 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데, 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 3 6 9 게임 숫자 몇까지 진행하시겠습니까 ? : ");
		int num = sc.nextInt();
		
		for(int i =1; i<= num; i++) {
			
			if( i % 3 == 0 ) {
				System.out.println("X");
			}else {
				System.out.println(i);
			}
		}
	}
}
