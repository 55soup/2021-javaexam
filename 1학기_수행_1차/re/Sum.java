/*1���� �Է¹��� ���ڱ����� ��*/

import java.util.Scanner;
public class Sum{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);
	
	System.out.print("���ڸ� �Է��ϼ��� : ");
	int num = scan.nextInt();

	int sum = 0;

	for(int i = 1; i <= num; i++){
	   sum += i;
	 }
	System.out.println("1����" + num+"������ ���� = "+sum);
	
  }
}