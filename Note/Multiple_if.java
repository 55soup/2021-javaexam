/*�Է¹��� ���� ������ 3�� ���, 5�� ���, Ȥ�� 8�� ��������� �˷��ִ� 
���α׷��� �����ϰ� �ۼ��϶�. ���� ������ 3�� ����̸� '3�� ����̴�"��
�������, 5�� ����̸� '5�� ����̴�'�� ����ϰ�, 8�� ����̸� '8�� ����̴�'��
����϶�. �� ���� ����̸� '��� ����� �ƴϴ�'�� ����϶�*/
/*If ������ �̿��Ͽ� �ۼ��϶�.
   Multiple_if.java
   number : �Է� ���� ��
   ������� ������� �ʰ� �ۼ��Ѵ�.*/

import java.util.Scanner;
public class Multiple_if{
  public static void main(String args[]){

	int number;
	Scanner scan = new Scanner(System.in);

	System.out.print("���� �Է��ϼ��� : ");
	number = scan.nextInt();

	if(number % 3 == 0){
	   System.out.println("3�� ����̴�.");
	}else if(number % 5 == 0){
	   System.out.println("5�� ����̴�.");
	}else if(number % 8 == 0){
	   System.out.println("8�� ����̴�.");
	}else{
	   System.out.println("��� ����� �ƴϴ�.");
	}
  }
}