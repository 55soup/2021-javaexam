package �ݺ���;
/*�Է¹��� �� n���� n1 ������ ���� ���Ͽ���.*/
/*1. �ʿ��� ���� : ������(int), ū ��(int), ��(int)
 * 2. ������, ū �� �Է¹ޱ�.
 * 3. (int i=������, i<=ū ��, i++)
 * 4. */
import java.util.Scanner;
public class Sum_nton {

	public static void main(String args[ ]) {
		// TODO Auto-generated method stub
		int num;
		int num1;
		int Sum_num_num1=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������, ū ���� �Է��ϼ���.(�����̽��ٷ� ����) : ");
		num = scan.nextInt();
		num1 = scan.nextInt();
		
		for(int i=num; i<=num1; i++) {
			Sum_num_num1 += i;
		}
		System.out.println(num+" ���� "+num1+" ������ ���� :"+Sum_num_num1);
	}
}
