package codeup_basic;

import java.util.Scanner;

public class Codeup_20220826_2 {

	public void test11() {
		// 011. �ֹι�ȣ �Է¹޾� ���� �ٲ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.  : ");
		
		String[] str = sc.next().split("-");
		
		System.out.println(str[0]+str[1]);
	}
	
	public void test12() {
		
		// 012. 10������ �Է¹޾� 8������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.  : ");
		
		int num = sc.nextInt();
		
		System.out.printf("%o", num);
	}
	
	public void test13() {
		// 013. 10������ �Է¹޾� 8������ ���
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("���ڸ� �Է��ϼ���.  : ");
				
		int num = sc.nextInt();
				
		System.out.printf("%x", num);
		
	}
	
	public void test14() {
//		// 014. ������1���� �Է¹޾� 10 ������ ����ϱ�
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("�����ڸ� �Է��ϼ���.  : ");
				
		char ch = sc.next().charAt(0);
		
		System.out.println((int)ch);
		
	}
	
	public void test15() {
		// 015. ������ �ƽ�Ű ���ڷ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("������ �Է��ϼ���.  : ");
				
		int num = sc.nextInt();
		
		System.out.println((char)num);
		
	}
	
	
	
	public void test16() {
		// 016. ����2���� �Է¹޾� �� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("����1  : ");
		int num1 = sc.nextInt();
		
		System.out.println("����2  : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);
		
	}
	
	public void test17() {
		// 017. ����2���� �Է¹޾� �� ����ϱ� ( �ѹ��� )
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ���.(����� ����)  : ");
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		
		
		System.out.println(num1+num2);
		
	}
	
	public void test18() {
		// 018. ����1���� ��ȣ�ٲ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���. : ");
		int num = sc.nextInt();

		System.out.printf("%d", -num);
		
	}
	
	public void test19() {
		// 019. ����1�� �Է¹޾� ���� ���� ����ϱ� 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ� 1���� �Է��ϼ���  : ");
		char ch = sc.next().charAt(0);
		char nextCh = (char)(ch+1);
		
		System.out.println(nextCh);
		
	}
	
	public void test20() {
		// 020. ���� 2�� �Է¹޾� ���� �� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����  2���� �Է��ϼ���  : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		System.out.println("a�� b�� ���� �� : "+num1/num2);
	}
	
}
