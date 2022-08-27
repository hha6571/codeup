package codeup_basic;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Codeup_20220826_3 {
	public void test21() {
		//21. 정수 3개 입력받아 합과 평균 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 세개 입력하세요 (띄어쓰기) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		float average = sum/3;
		
		System.out.println("합 : " +sum);
		System.out.printf("평균 : %.1f " ,average);
	}
	
	public void test22() {
		//22. 두 정수 입력받아 비교하기1
		//두 정수(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개 입력하세요 (띄어쓰기) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public void test23() {
		//23. 두 정수 입력받아 비교하기2
		//a와 b가 같으면 1을, 같지 않으면 0을 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개 입력하세요 (띄어쓰기) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public void test24() {
		//24. 정수 3개 입력받아 가장 작은 수 출력하기

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력하세요 (띄어쓰기) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int min = (num1>num2? num2>num3? num3:num2 : num1 >num3 ? num3:num1);
		
		System.out.println(min);
	}
	
	public void test25() {
		//24. 정수 3개 입력받아 짝수만 출력하기

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력하세요 (띄어쓰기) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if( a%2 == 0 ) System.out.println(a);
		if( b%2 == 0 ) System.out.println(b);
		if( c%2 == 0 ) System.out.println(c);
		
		
		
	}
	public void test26() {
		//26. 정수 3개 입력받아 짝/홀 출력하기

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력하세요 (띄어쓰기) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		if( a%2 == 0 ) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		if( b%2 == 0 ) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		if( c%2 == 0 ){
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	
	public void test27() {
		//27. 정수 1개 입력받아 분석하기
		//정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 1개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("plus");
			if(num%2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else {
			System.out.println("minus");
			if(!(num%2 == 0)) {
				System.out.println("odd");
			}else {
				System.out.println("even");
			}
		}
	}
	public void test28() {
		//28. 정수 1개 입력받아 평가 출력하기
		// 점수(정수, 0 ~ 100)를 입력받아 평가를 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를  입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >=90 ) {
			System.out.println("A");
		}else if( score >= 70 && score <90) {
			System.out.println("B");
		}else if( score >= 40 && score < 70) {
			System.out.println("C");
		}else if ( score < 40) {
			System.out.println("D");
		}
	}
	
	public void test29() {
		//29. 평가 입력받아 다르게 출력하기
		// 평가 내용
//		평가 : 내용
//		A : best!!!
//		B : good!!
//		C : run!
//		D : slowly~
//		나머지 문자들 : what?

		Scanner sc = new Scanner(System.in);
		
		System.out.println("평가를  입력하세요 : ");
		String grade = sc.next();
		
		switch(grade) {
		case "A" : System.out.println("best!!!"); break;
		case "B" : System.out.println("good!!"); break;
		case "C" : System.out.println("run!"); break;
		case "D" : System.out.println("slowly~"); break;
		default : System.out.println("what?"); break;
		}
		
	}
	
	public void test30() {
		//30. 월 입력받아 계절 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3 : 
		case 4 : 
		case 5 : System.out.println("Spring"); break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println("Summer"); break;
		case 9 : 
		case 10 : 
		case 11 : System.out.println("autumn");break;
		case 12 : 
		case 1 :
		case 2 : System.out.println("winter"); break;
		}
	}
}
