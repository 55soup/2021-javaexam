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
/* +�ǹ̾��� �Է� ������ ���� +�Է¼����� +switchcase������ �ٲٱ�*/

import java.util.InputMismatchException;
import java.util.Scanner;
public class Judge_zodiac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years=-3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ������ �Է��ϸ� 12������ �˷��帳�ϴ�. (1900�� ~ 2021�� ���� ����)");
		System.out.print("������ �Է��ϼ���(4�ڸ�) : ");
		
		try {//���ڿ��� �Է��Ѱ��
			years = scan.nextInt();
		}catch(Exception letter) {
			System.out.println("�Է��� ���ڸ� �����մϴ�.");
		} //���ܻ���
		
		if(years<1900||years>2021) {//������ ������� �Է��Ѱ��.
			System.out.println("�Է��� 1900��~2021�⸸ �����մϴ�.");
		}else {
			for(int i=1900; i<=2021; i+=12) {
				switch(years%i) {
				case 0: System.out.println("��� �Դϴ�."); break;
				case 1: System.out.println("�Ҷ� �Դϴ�."); break;
				case 2: System.out.println("ȣ���̶� �Դϴ�."); break;
				case 3: System.out.println("�䳢�� �Դϴ�."); break;
				case 4: System.out.println("��� �Դϴ�."); break;
				case 5: System.out.println("��� �Դϴ�."); break;
				case 6: System.out.println("���� �Դϴ�."); break;
				case 7: System.out.println("��� �Դϴ�."); break;
				case 8: System.out.println("�����̶� �Դϴ�."); break;
				case 9: System.out.println("�߶� �Դϴ�."); break;
				case 10: System.out.println("���� �Դϴ�."); break;
				case 11: System.out.println("������ �Դϴ�."); break;
				
				}
			}
				
			}
	}

}