package com.human.ex;

public class JavaClass7 {

	public static void main(String[] args) {
		//1������
		java.util.Scanner scanner = new java. util.Scanner(System.in);
		System.out.println("���� �Է�:");
		String �����Է�=scanner.nextLine();
		System.out.println("�̸� �Է�:");
		String �̸��Է�=scanner.nextLine();
		System.out.println(�̸��Է�+ "��" +"������" +�����Է�+"�Դϴ�");
		
		//2������ 
		System.out.println("Ű�� �Է��ϼ���(cm):");
		String str=scanner.nextLine();
		int i1=Integer.parseInt(str);
		System.out.println("m�� ��ȯ�� ����� "+i1*0.01+ "m�Դϴ�.");
		
		//3������
		System.out.println("������ ����, ����, ���̸� �ѹ��� �Է�:");
		String ����=scanner.nextLine();
		double d2=Double.parseDouble(����);
		String ����=scanner.nextLine();
		double d3=Double.parseDouble(����);
		String ����=scanner.nextLine();
		double d4=Double.parseDouble(����);
		System.out.println("������ ���Ǵ�"+(d2*d3*d4)+"�Դϴ�.");
		
		
		//4������
		
		System.out.println("���� �Է��ϼ���:");
		String str5=scanner.nextLine();
		int i3=Integer.parseInt(str5);
		System.out.println((i3*3.3)+"�������Դϴ�.");
		
		
		//5������
		System.out.println("����:");
		String ����=scanner.nextLine();
		int i4=Integer.parseInt(����);
		System.out.println("�ӵ�:");
		String �ӵ�=scanner.nextLine();
		int i5=Integer.parseInt(�ӵ�);
		System.out.println("�������:"+(0.5*i4*i5*i5));
				
		
		//6�� ����
		System.out.println("����� �̸��� �����Դϱ�?");
		String str11=scanner.nextLine();
		System.out.println("����� ���̴� ����Դϱ�?");
		String str12=scanner.nextLine();
		int i12=Integer.parseInt(str12);
		System.out.println("����� Ű�� ���Դϱ�?");
		String str13=scanner.nextLine();
		int i13=Integer.parseInt(str13);
		System.out.println("����� �����Դ� ���Դϱ�?");
		String str14=scanner.nextLine();
		int i14=Integer.parseInt(str14);
		System.out.println("����� �̸���" +str11+ "���̴�" +i12+ "Ű��" +i13+ "�����Դ�" +i14);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
