package com.human.ex;

public class JavaClass6 {

	public static void main(String[] args) {
		//����� �Է��� �޾� ����.
		//����ڰ� Ű����� �Է��� �����͸� ���α׷����� �޾Ƽ� ó���ϴ� ��.
		//int a //int a���� a�� �۾��ϵ��� ���⼭�� scanner�� �۾���. 
		
		java.util.Scanner scanner //��ĳ�ʴ� �ܺ���ġ��� ��.
			=new java.util.Scanner(System.in);
		System.out.println("���ڿ��� �Է����ּ���>>");
		String str10=scanner.nextLine();//����� �Է��� �޾� ���ڿ��� �������ִ� �Լ�
		System.out.println(str10+"�� �Է��ϼ̽��ϴ�.");
		
		//����� �Է��� ��� ���ڿ��̴�. 
		//���ڸ� ����ڷκ��� �������� ���ڿ��� ���ڷ� �����ϴ� �Լ��� �������.
		
		System.out.println("������ �Է����ּ���>>");
		String str11=scanner.nextLine();
		int i10=Integer.parseInt(str11);
		System.out.println("�Է��� ������;"+i10);
		
		//����ڿ��� 2���� �Է¹޾� ���ؼ� ����غ���.
		System.out.println("������ �Է����ּ���>>");
		//String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		int i1=Integer.parseInt(str11);
		int i2=Integer.parseInt(str2);
		System.out.println("�Է��� ������ ����:"+(i1+i2)+"�Դϴ�.");
	
		
	
		
		
		System.out.println("���α׷� ����"); //�ܼ� â���� ���� �Է� �� ���� �����ָ� ���α׷� ����� ��
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
	}

}
