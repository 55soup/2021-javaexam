/*���ڸ� �Է¹ް� 5�� ������� �ƴ��� �Ǵ�.*/

import java.util.Scanner;
public class Multiple{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);

	System.out.print("���ڸ� �Է��ϼ��� : ");
	int num5 = scan.nextInt();

	String judge = (num5 % 5 == 0)?"5�� ����Դϴ�.":"5�� ����� �ƴմϴ�.";
	System.out.println(judge);
	
  }
}