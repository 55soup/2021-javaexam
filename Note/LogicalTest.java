/* Ű����� ���� ����, ������ �Է¹޾� 
    �����̰ų� ���̰� 18�� �̸��̸� "ȸ������ ����"�̶�� ���
    �׷��� ������ "ȸ������ �Ұ�"��� ���*/

import java.util.Scanner;
public class LogicalTest{
  public static void main(String args[ ]){
	//������ => ����, ����
	int age;
	int gender; //���� 1 ���� 0

	//�Է�
	Scanner scan = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	age = scan.nextInt();
	System.out.print("���� �Է� : ");
	gender = scan.nextInt();

	//ó��
	if(gender==1 || age <18){
	  System.out.println("ȸ������ ����");
	}else{
	   System.out.println("ȸ������ �Ұ�");
	}
  }
}