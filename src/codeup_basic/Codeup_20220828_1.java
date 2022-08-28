package codeup_basic;

import java.util.Scanner;

public class Codeup_20220828_1 {
	
	public void test41() {
		// 41. 빛 섞어 색 만들기 
		// 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
		// 줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("r, g, b의 가짓수를 입력하세요 : ");
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for(int i = 0 ; i < r; i ++) {
			for(int j = 0; j <g; j ++) {
				for(int k = 0; k <b; k++) {
					System.out.println( i + " " + j + " " + k);
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
	
	public void test42() {
		// 42. 소리 파일 저장용량 계산하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 소리 파일 용량 계산하기 : ");
		
		double h = sc.nextInt(); // 1초 동안 마이크로 소리강약을 체크하는 수
		double b = sc.nextInt(); // 한번 체크한 결과를 저장하는 비트
		double c = sc.nextInt(); // 좌우 등 소리를 저장할 트랙 개수 채널 
		double s = sc.nextInt(); // 녹음할 시간
		// h * b * c * s  = 저장공간
		
		double result = 0;
		
		//필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력
		
		result = h * b * c * s / 8 / 1024 /1024;
		System.out.printf("%.1f MB", result);
	}
	
	public void test43() {
		// 43. 소리 파일 저장용량 계산하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 그림 파일 용량 계산하기 : ");
		
		double w = sc.nextDouble(); // 가로 해상도 
		double h = sc.nextDouble(); // 세로 해상도
		double b = sc.nextDouble(); // 비트 
		
		double result = 0;
		
		result = w * h * b / 8 / 1024 / 1024;
		
		System.out.printf("%.2f MB", result);
		
	}
	
	public void test44() {
		//44. 여기까지! 이제 그만~
		// 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우, 그때까지의 합을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("언제까지 합을 계산하실건가요 ? : ");
		int num = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <=num; i++) {
			if(result <= num ) {
				result += i;
			}
		}
		System.out.println(result);
	}
	
	public void test45() {
		// 45. 3의 배수는 통과?
		// 1부터 입력한 정수까지 1씩 증가 단, 3의 배수는 출력하지 않음
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1개를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <=num; i++) {
			if( i % 3 == 0 ) {
				System.out.print("");
			}else {
			System.out.print(i);
			System.out.print(" ");
		}
		}
	}
	
	public void test46() {
		//46. 수 나열하기 1 
		// 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n) 
		// n번째 수 를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n) 입력 : ");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		
		// 등차수열의 식 : a + (n-1)d
		result = a + (n-1)*d;
		System.out.println(result);
	}
	public void test47() {
		// 47. 수 나열하기 2 
		// 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 값(a), 등비의 값(r), 몇 번째 수 인지를 의미하는 정수(n) 입력 : ");
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(a * (long)(Math.pow(r, n - 1))); 
	}
}
