//���� ���̿� �ѷ� ���ϱ�
//�빮�� => Ŭ���� �̸�, ���


import  java.util.Scanner; 
public class Constant{
	public static void main(String args[ ]){
		//���� ����
		final double PI = 3.14;//��� => ������ �ʴ� �� , �빮��
		double r = 5.5;
		double area, circum;

		//Ű���� �Է�
		System.out.print("�������Է�: ");
		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble( );

		//���� ��� 
		area = PI*r*r;
		circum = 2*PI*r;
		System.out.println("������" + r + "  �� ���� ����: " + area + "   �ѷ� : " + circum);

  	}
}