package ���ǹ�;

/*�¾�ظ� �Է¹޾� �츦 ���ϴ� ���α׷��� �ۼ��Ѵ�.
 * �����ι�������̽������� 
 * ��, ��, ȣ����, �䳢, ��, �� ,��, ��, ������, ��, ��, ���� ���� 
 * 1900��~ 2021�� ������ �츦 ����.*/
/*1900�� ���� ��� ����. �� �ڷκ��� 12���� ������ �ΰ� ��.
 * 
 * 1. �ʿ��� ���� : �Է¹޴� ����(int)
 * 2. ���� �Է¹ޱ�
 * 3. switch ~ case ��쿡 ��� 1900 ~ 2020 break; 
 * OR ��츦 �������� ����� �������� ����. 
 * 		ex)1900��/1900 == 0 -> ���
 * 		�������� 1�϶��� �Ҷ�, 2�϶��� ȣ���̶� �̷�������*/
import java.util.Scanner;
public class Judge_zodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years;//�Է¹޴� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(1900~2021) : "); //���� �Է¹ޱ�
		years = scan.nextInt();
		
		for(int i=1900; i<=2021; i+=12) {
			if(years%i==0) 
				System.out.println("�� �� �Դϴ�.");
			if(years%i==1)
				System.out.println("�� �� �Դϴ�.");
			if(years%i==2)
				System.out.println("ȣ���� �� �Դϴ�.");
			if(years%i==3)
				System.out.println("�䳢 �� �Դϴ�.");
			if(years%i==4)
				System.out.println("�� �� �Դϴ�.");
			if(years%i==5)
				System.out.println("�� �� �Դϴ�.");
			if(years%i==6)
				System.out.println("�� �� �Դϴ�.");
			if(years%i==7)
				System.out.println("�� �� �Դϴ�.");
			if(years%i==8)
				System.out.println("������ �� �Դϴ�.");
			if(years%i==9)
				System.out.println("�� �� �Դϴ�.");
			if(years%i==10)
				System.out.println("�� �� �Դϴ�.");
			if(years%i==11)
				System.out.println("���� �� �Դϴ�.");
			}
			/*��츦 �������� ������ ����.
			 * ex) 
			 * ����ΰ��
			 * 1900�� / 1900�� == 0 -> �� ��
			 * �Ҷ��ΰܿ�
			 * 1901�� / 1900�� == 0 -> �� ��
			 * �� �� �������� 2�� �䳢 �� 3�̸� �� ��... */
		}
	}
