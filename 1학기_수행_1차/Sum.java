/*1���� �Է¹��� ���ڱ����� ��*/

import java.util.Scanner;
public class Sum{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);
	int sum = 0;

	System.out.print("���� �Է� : ");
	int n = scan.nextInt();

	for(int num = 1; num <=n; num++){
	
	sum += num;
	
	}
	System.out.println(sum);

	
  }
}
