package com.human.ex;

public class JavaClass8 {

	public static void main(String[] args) {
		//String.format() ���ο� ���ڿ��� ����� �Լ�, %s�� ���� �� ���� ���ڰ� ������.
		String str1=String.format("�ȳ� �� �̸��� %s","ȫ�浿");
		System.out.println(str1);
		//������ ���ڿ� ó�� %s �������� ������ ó�� ����
		str1=String.format("�ȳ� �� �̸��� %s�̰� ��� ���� %s �ٴϴ� " + 
				 "�б��� %s �Դϴ�.","ȫ�浿","����","�޸�");		//ù ��° ������-ȫ�浿�� ���ڸ��� �� ��° ������ ������ ���ڸ���
		System.out.println(str1);
		
		str1=String.format("���̴� %d, Ű�� %f", 20,170.3);
		System.out.println(str1);
		//%s�� ���ڿ�
		//%d�� ����
		//%f�� �Ǽ�
		
		int i1=30;
		double d1=3.141592;
		String str2="�ȳ� �ϼ���";
		//String.format�� ����ؼ� 3���� ����غ���
		str1=String.format("%d %f %s", i1,d1,str2);
		System.out.println(str1);
		System.out.println(String.format("%d %f %s", i1,d1,str2));
		
		str1=String.format(":%d:%-10d:%10d:", i1,i1,i1);//-10�� �������� �������� 10�� ������ ����
		                        //���ڰ� 10�� ��� 10ĭ �� �տ� 8ĭ ����, ���ڰ� 100�� ��� 10ĭ �� 7ĭ ���.
		System.out.println(str1);
		
		str1=String.format(":%f:%.3f:", d1,d1,d1);//�Ҽ��� 3�ڸ������� ��Ÿ��,
		//���࿡ �ݿø��� ���� ���ƾ� �Ѵٸ� ������ �ڸ����� -5���ֱ� ex)3.1415 -> 3.1410
		System.out.println(str1);
		
		str1=String.format("%%\"");//%�� ������ ���ļ� %% �ΰ� ����� 1���� ��µ�, \""�� "�Ѱ��� ���
		System.out.println(str1);
		
		//%[-][0][��ü�ڸ���].[���е�][��ȯ����]
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
	}

}
