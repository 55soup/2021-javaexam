/*�簢���� �غ��� ���̸� �Է� �޾� �簢���� ���̸� ���ϴ� ���α׷��� �ۼ��϶�.
(DataTypeTest_04.java)*/

import java.util.Scanner;
public class DataTypeTest_04{
  public static void main(String args[ ]){
	//���� ����
	double base;
	double height;
	double area;

	//�Է�
	Scanner scan = new Scanner (System.in);
	//�غ��Է�
	System.out.print("�غ� �Է� : ");
	base = scan.nextDouble();
	//�����Է�
	System.out.print("���� �Է� : ");
	height = scan.nextDouble();
	
	area = base*height;
	
	System.out.println("�غ��� ���� : " + area);	
  }
}