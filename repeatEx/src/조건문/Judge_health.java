package ���ǹ�;
/*�ڽ��� Ű�� ü��, Ȱ�������� �Է��ϸ� ���α��� �Ϸ����Į�θ��� �˷��ݴϴ�.
 * �Ϸ���� Į�θ� = ǥ��ü��(kg)*Ȱ������
 * ǥ��ü�� = (�ڽ��� Ű-100)*0.9
 * Ȱ������
 * - �ɾƼ� �ַ� ��Ȱ�ϰų� ���� ������ �����Ӹ� �Ͽ� Ȱ������ ���� ���, 25
 * - ��Ģ���� ��Ȱ�� ������ Ȱ������ ���� ���, 33
 * - ��ü�뵿 �� ��� ��ü Ȱ������ ���� ���, 40*/

/*1. �ʿ��� ���� : Ű(double), Ȱ������(int), ǥ��ü��(double) �Ϸ���� Į�θ�(double)
 * 2. ���� �Է¹ޱ� -
 * 3. ǥ��ü�� ���.
 * 4. �Ϸ� ���� Į�θ� ���.*/
import java.util.Scanner;
public class Judge_health {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		int activity;
		double standard_weight;
		double kcal;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = scan.nextDouble();
	
		System.out.println("1) �ɾƼ� �ַ� ��Ȱ�ϰų� ���� ������ �����Ӹ� �Ͽ� Ȱ������ ����. ");
		System.out.println("2) ��Ģ���� ��Ȱ�� ������ Ȱ������ ������.");
		System.out.println("3) ��ü�뵿 �� ��� ��ü Ȱ������ ����.");
		System.out.println("�ڽ��� ��ҿ� Ȱ���ϴ� ������ ���ڷ� �Է��ϼ���.");
		activity = scan.nextInt();
		
		switch(activity) {
		case 1 : activity = 25; break;
		case 2 : activity = 33; break;
		case 3 : activity = 40; break;
		default : System.out.println("���ڸ� �߸��Է��߽��ϴ�.");
		}
		
		standard_weight = (height-100)*0.9;
		kcal = standard_weight*activity;
		
		System.out.println("����� �Ϸ� ���� Į�θ��� : "+ kcal + "kcal �Դϴ�.");
	}

}
