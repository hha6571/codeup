package codeup_basic;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Codeup_20220826_3 {
	public void test21() {
		//21. ���� 3�� �Է¹޾� �հ� ��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �Է��ϼ��� (����) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		float average = sum/3;
		
		System.out.println("�� : " +sum);
		System.out.printf("��� : %.1f " ,average);
	}
	
	public void test22() {
		//22. �� ���� �Է¹޾� ���ϱ�1
		//�� ����(a, b)�� �Է¹޾� a�� b���� ũ�� 1��, a�� b���� �۰ų� ������ 0�� ���

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ΰ� �Է��ϼ��� (����) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public void test23() {
		//23. �� ���� �Է¹޾� ���ϱ�2
		//a�� b�� ������ 1��, ���� ������ 0�� ���

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ΰ� �Է��ϼ��� (����) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public void test24() {
		//24. ���� 3�� �Է¹޾� ���� ���� �� ����ϱ�

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3�� �Է��ϼ��� (����) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int min = (num1>num2? num2>num3? num3:num2 : num1 >num3 ? num3:num1);
		
		System.out.println(min);
	}
	
	public void test25() {
		//24. ���� 3�� �Է¹޾� ¦���� ����ϱ�

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3�� �Է��ϼ��� (����) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if( a%2 == 0 ) System.out.println(a);
		if( b%2 == 0 ) System.out.println(b);
		if( c%2 == 0 ) System.out.println(c);
		
		
		
	}
	public void test26() {
		//26. ���� 3�� �Է¹޾� ¦/Ȧ ����ϱ�

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3�� �Է��ϼ��� (����) : ");
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
		//27. ���� 1�� �Է¹޾� �м��ϱ�
		//���� 1���� �ԷµǾ��� ��, ��(minus)/��(plus)�� ¦(even)/Ȧ(odd)�� ���

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 1�� �Է��ϼ��� : ");
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
		//28. ���� 1�� �Է¹޾� �� ����ϱ�
		// ����(����, 0 ~ 100)�� �Է¹޾� �򰡸� ���

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������  �Է��ϼ��� : ");
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
		//29. �� �Է¹޾� �ٸ��� ����ϱ�
		// �� ����
//		�� : ����
//		A : best!!!
//		B : good!!
//		C : run!
//		D : slowly~
//		������ ���ڵ� : what?

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�򰡸�  �Է��ϼ��� : ");
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
		//30. �� �Է¹޾� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
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
