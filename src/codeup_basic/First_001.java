package codeup_basic;

import java.util.Scanner;

public class First_001 {

		
		public void test01() {
		// 001. ���� 1�� �Է¹޾� �״�� ����ϱ�
		
		System.out.println("������ 1�� �Է��Ͻÿ�. : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.printf("%d", num);
		
		sc.close();
		
		}
		
		public void test02() {
		// 002. ���� 1�� �Է¹޾� �״�� ����ϱ� 
		
		System.out.println("���� 1���� �Է��Ͻÿ�. : ");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		System.out.printf("%c", ch);
		
		sc.close();
		
		}
		
		public void test03() { 
		// 003. �Ǽ� 1�� �Է¹޾� �״�� ����ϱ� 
		
		System.out.println("�Ǽ� 1���� �Է��Ͻÿ�. : ");
		Scanner sc = new Scanner(System.in);
				
		float x = sc.nextFloat();
		
		System.out.printf("%f", x);
		
		sc.close();
		
		}
		
		public void test04() {
		// 004. ���� 2�� �Է¹޾� �״�� ����ϱ�
		
		System.out.println("���� 2���� �Է��ϼ���.");
		
		System.out.println("����1 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("����2 : ");
		int num2 = sc.nextInt();
		
		
		System.out.printf("%d %d", num1, num2);
		
		sc.close();
		}
		
		public void test05() {
		// 005. ���� 2���Է¹޾� ���� �ٲ� ����ϱ�
		
		char x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 2���� �Է��ϼ���.");
		System.out.println("���� 1 : ");
		char ch1 = sc.next().charAt(0);
		System.out.println("���� 2 : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.printf("%c %c", ch2, ch1);
		
		sc.close();
		
		}

		public void test06() {
		// 006. �Ǽ� �Է¹޾� ��° �ڸ����� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Ǽ��� �Է��ϼ��� : ");
		float num = sc.nextFloat();
		
		System.out.printf("%.2f", num);
		
		sc.close();
		
		}
		
		
		public void test07() {
		// 007. ���� 1�� �Է¹޾� 3�� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.printf("%d %d %d", num, num, num);
		
		sc.close();
		
		}
		
		public void test08() {
		// 008. �ð� �Է¹޾� �״�� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ð��� �Է��ϼ���. �� :  ");
		int hour = sc.nextInt();
		System.out.println("�ð��� �Է��ϼ���. �� :  ");
		int min = sc.nextInt();
		
		System.out.printf("%d:%d", hour, min);
		
		sc.close();
		}
		
		
		public void test09() {
		// 009. ��, ��, ���� �Է¹޾� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� : ");
		String year = sc.next();
		System.out.println("�� : ");
		String month = sc.next();
		System.out.println("�� : ");
		String day = sc.next();
		
		System.out.printf("%s�� %s�� %s��", year, month, day);
		
		sc.close();
	}
		public void test10() {
			// 010. �ú��� �Է¹޾� �и� ����ϱ�
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�ð��� �Է��ϼ��� (�� ) 12:23:12 ) : ");
			String str = sc.next();
			String[] arr = str.split(":");
			
			System.out.println("�� : "+ arr[1]);
			
			sc.close();
		}
}
