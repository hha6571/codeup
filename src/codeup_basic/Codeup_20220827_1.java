package codeup_basic;

import java.util.Scanner;

public class Codeup_20220827_1 {

	public void test31() {
		//31. ���� 1�� �Է¹޾� ī��Ʈ �ٿ� ����ϱ�
		// 1�� ���̸鼭 �� �ٿ� �ϳ��� 1�� �� ������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 1���� �Է��ϼ���. : ");
		int num = sc.nextInt();
		
		for(int i = num; i>0; i--) {
			System.out.println(i);
		}
	}
	public void test32() {
		//32. ���� 1�� �Է¹޾� ī��Ʈ �ٿ� ����ϱ�
		// 1�� ���̸鼭 �� �ٿ� �ϳ��� 0�� �� ������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 1���� �Է��ϼ���. : ");
		int num = sc.nextInt() - 1;
		
		for(int i = num; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	public void test33() {
		//33. ������(a ~ z) 1���� �ԷµǾ��� �� �� ���ڱ����� ���ĺ��� ������� ����غ���.
		// �ƽ�Ű�ڵ带 �̿��Ͽ� Ǯ���ϱ�
		// 102 >  97 98 99 100 101 102
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ� �ҹ��ڸ� �Է��ϼ���. : ");
		int ascii = sc.nextLine().charAt(0);
		
		for(int i = 97; i <= ascii; i++){
			System.out.println((char)i);
		}
		
	}
	public void test34() {
		//34.���� 1�� �Է¹޾� �� ������ ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����1���� �Է��ϼ���. : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++){
			System.out.println(i);
		}
		
	}
	public void test35() {
		//35. ����1���� �Է¹޾� 1���� �� ������ ¦���� ���� ���Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 1���� �Է��ϼ��� : ");
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
		//36. ���ϴ� ���ڰ� �Էµ� ������ �ݺ� ����ϱ�
		// 'q' �� �Է� �ɶ����� �Է��� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ� 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		
		String[] strr = sc.nextLine().split(" ");
		
		for( int i =0; i < strr.length; i++) {
			System.out.println(strr[i]);
			if( strr[i].equals("q")) {
				break;
			}
		}
	}
	
	public void test37() {
		// 37. �������� ���ؾ� �ұ�?
		// 1, 2, 3, 4, 5 ... �� ������� ��� ���� ���� �����ٰ�,
		// �Էµ� ������ ���ų� Ŀ���� ��, �������� ���� ������ ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
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
		// 38. �ֻ����� 2�� ������ ?
		// ���� �� �ִ� �ֻ����� ���ڸ� �� ��Ʈ�� ���� �ٲ� ��� ����Ѵ�. ù ��° ���� n, �� ��° ���� m���� ������ ����ϵ��� �Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֻ����� ������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i =1; i <= n; i++) {
			for(int j= 1; j <= m; j++) {
				System.out.println(i +" "+  j);
			}
		}
	}
	
	public void test39() {
		//39. 16���� ������?
		//A, B, C, D, E, F �� �ϳ��� �Էµ� ��, 1���� F���� ���� 16���� �������� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.println(" A~F���� �ϳ��� �Է��ϼ��� : ");
		
		int num = sc.nextInt(16);
		
		for(int i = 1; i <16; i++ ) {
			System.out.printf("%x * %x = %x\n", num, i, num*i);
		}
	}
	
	public void test40() {
		// 40. 3 6 9 ������ ���� ���� !
		// 1 ���� �� ������ ������� ������ �ΰ� ���� ����ϴµ�, 3 �Ǵ� 6 �Ǵ� 9�� ��� �� �� ��� ���� �빮�� X �� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 3 6 9 ���� ���� ����� �����Ͻðڽ��ϱ� ? : ");
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
