package com.human.ex;

		public class JavaClass {
			public static void main(String[] args) {
				//byte,short
			
				byte b1;
				//�Ҵ���� ���� ������ ����� �� ����. 
				//System.out.println(b1);
				b1=10;
				System.out.println(b1);
				
				short s1=11;
				System.out.println(s1);
				
				int i1=10;
				System.out.println(i1);
				
				i1=20;
				i1=3*20+10;//������� ����� ������ i1�� ����ȴ�. 
				i1=10+3*20;//������� ���� ���� ���ؼ� ����.
				//�켱������ ����Ǿ� ����ȴ�.
				
				//1.i1.���� 10���� ����
				//2.���� i1���� 10�� �߰��Ͽ� i1�� ����
				//3.i1���� ���
				i1=10;
				i1=10+i1;
				i1=i1+10;
				//i1+=10; �� 2���� ���� �ǹ�
				System.out.println(i1);
				
				//1.i2������ �����Ͽ� 10�� �ְ�
				//2.i2�� i1�� ���� ���� ���� ������ i3�� �־�
				//3.i3�� ���
				int i2=10;
				int i3=i1+i2;
				System.out.println(i3);
				System.out.println(i1+i2);
				
				long l1=10l;
				System.out.println(l1);
				
				//float a=1.4;//error
				float a=1.4f;
				System.out.println(a);
				
				double b=3.14;
				System.out.println(b);
				
				String str="helloworld";
				System.out.println(str);
				
				//ī�信 ���� �ø�. �Էº����� ������ ������ ��.
				//double b=3.14;
				//�Է°��� ������ �־ ó���Ͻÿ� 
				//�Է°��� ���α׷� �߰��� ����� ó������ ���ÿ�.
				
				
				
				
				System.out.println(Math.sqrt(9));
				
				
				
	
				
					
		
	
		
	}

}
