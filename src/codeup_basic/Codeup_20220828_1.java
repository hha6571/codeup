package codeup_basic;

import java.util.Scanner;

public class Codeup_20220828_1 {
	
	public void test41() {
		// 41. �� ���� �� ����� 
		// ���� �� �ִ� rgb ���� ������ ��������(����� �ö󰡴� ��, 12345... abcde..., �����ٶ�...)����
		// ���� �ٲ� ��� ����ϰ�, �������� �� ������ ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("r, g, b�� �������� �Է��ϼ��� : ");
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
		// 42. �Ҹ� ���� ����뷮 ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" �Ҹ� ���� �뷮 ����ϱ� : ");
		
		double h = sc.nextInt(); // 1�� ���� ����ũ�� �Ҹ������� üũ�ϴ� ��
		double b = sc.nextInt(); // �ѹ� üũ�� ����� �����ϴ� ��Ʈ
		double c = sc.nextInt(); // �¿� �� �Ҹ��� ������ Ʈ�� ���� ä�� 
		double s = sc.nextInt(); // ������ �ð�
		// h * b * c * s  = �������
		
		double result = 0;
		
		//�ʿ��� ���� ������ MB ������ �ٲپ� ����Ѵ�. ��, �Ҽ��� ��° �ڸ����� �ݿø��� ù° �ڸ����� ����ϰ� MB�� ������ �ΰ� ���
		
		result = h * b * c * s / 8 / 1024 /1024;
		System.out.printf("%.1f MB", result);
	}
	
	public void test43() {
		// 43. �Ҹ� ���� ����뷮 ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" �׸� ���� �뷮 ����ϱ� : ");
		
		double w = sc.nextDouble(); // ���� �ػ� 
		double h = sc.nextDouble(); // ���� �ػ�
		double b = sc.nextDouble(); // ��Ʈ 
		
		double result = 0;
		
		result = w * h * b / 8 / 1024 / 1024;
		
		System.out.printf("%.2f MB", result);
		
	}
	
	public void test44() {
		//44. �������! ���� �׸�~
		// 1, 2, 3, 4, 5 ... ������� ��� ���ذ��ٰ�, �� ���� �Էµ� �������� Ŀ���ų� �������� ���, �׶������� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� ����Ͻǰǰ��� ? : ");
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
		// 45. 3�� ����� ���?
		// 1���� �Է��� �������� 1�� ���� ��, 3�� ����� ������� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 1���� �Է��ϼ��� : ");
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
		//46. �� �����ϱ� 1 
		// ���� ��(a), ������ ��(d), �� ��° �� ������ �ǹ��ϴ� ����(n) 
		// n��° �� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ��(a), ������ ��(d), �� ��° �� ������ �ǹ��ϴ� ����(n) �Է� : ");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		
		// ���������� �� : a + (n-1)d
		result = a + (n-1)*d;
		System.out.println(result);
	}
	public void test47() {
		// 47. �� �����ϱ� 2 
		// ���� ��(a), ���(r), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� �� n��° ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ��(a), ����� ��(r), �� ��° �� ������ �ǹ��ϴ� ����(n) �Է� : ");
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(a * (long)(Math.pow(r, n - 1))); 
	}
}
