/*���� �� ���� �Է¹޾� ū ���� ���ϴ� ���α׷� �ۼ� if*/

import java.util.Scanner;
public class MaxIfElse{
  public static void main(String args[ ]){
	//���� ����
	int a;   //int a,b;
	int b;
	Scanner scan = new Scanner(System.in);

	//�Է�
	System.out.print("��1 �Է� : ");
	a = scan.nextInt();
	System.out.print("��2 �Է� : ");
	b = scan.nextInt();

	//�� �� ��
	if(a>b){
	   System.out.println("ū �� : "+a);
	}else{ // a<=b:���� ��찡 ���ٰ� ����
	   System.out.println("ū �� : "+b);
	}

  }
}