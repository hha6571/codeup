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
}
