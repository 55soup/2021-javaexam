package ���ǹ�;
/* �հ������� ������ �Է��� ��, �л����� ������ �Է��Ѵ�. ������ �Է����� �� �հݿ��θ� �˷��ش�.
 * �����ϰ� ���� ���� ������ �Է��ϸ� �ȴ�.
 * */

/*1. �ʿ��� ���� : �����հ�����(int)-�Է¹��� ���� ����� �� �� �ִ°�?, �л����� ����(�迭/?),
 * 2. while(true) �л����� ������ �Է¹޴´�. if(�Է¹��� ���� <0) break;
 * 3.   */
import java.util.Scanner;
public class Judge_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int CUTLINE;
		int stu_score;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�հݱ��������� �Է��ϼ���: ");
		CUTLINE = scan.nextInt();
		
		
		while(true) {
			System.out.print("�л����� ������ �Է��ϼ���: ");
			stu_score = scan.nextInt();
			
			if(stu_score < 0) break;
			if(stu_score >= CUTLINE) {
				System.out.println("�հ�");
			}else {
				System.out.println("���հ�");
			}
			
		}
	}

}
