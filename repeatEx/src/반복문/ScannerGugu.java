package �ݺ���;
/*�Է��� ����(����) �� �������� ���մϴ�.*/
/*1. �ʿ��� ���� : �Է¹��� ����(int) ���(int)
 * 2. �����Է¹ޱ�
 * 3. for(int i=1; i<=9; i++)
 * 		num*i;
 * 		���Ѱ�� ���.*/
import java.util.Scanner;
public class ScannerGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� (����): ");
		num = scan.nextInt();
		
		Gugu(num);
	}
	public static void Gugu(int num) {
		
		int result;
		
		for(int i=1; i<=9; i++) {
			result=num*i;
			System.out.println(num+"*"+i+" = "+ result);
		}
		
	}

}
