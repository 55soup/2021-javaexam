/*�� ������ �Է� �޾� ���� ���� ���� ���ϱ�
   (MinOfThree.java) 
*****2�� �Ǳ� �׽�Ʈ�� ����*/
//Scanner ��ü�� �̿��Ͽ� �Է� �ޱ�, ���� �� �Է� ���ٰ� ����
//��ø if�� (if���� �ȿ� if��)�� ����ϱ�.

import java.util.Scanner;
public class MinOfThree{
  public static void main(String args[ ]){

	//���� ����
	int n1,n2,n3;
	Scanner scan = new Scanner(System.in);

	//�Է�
	System.out.print("ù ��° ���� �Է��ϼ��� : ");
	n1 = scan.nextInt();
	System.out.print("�� ��° ���� �Է��ϼ��� : ");
	n2 = scan.nextInt();
	System.out.print("�� ��° ���� �Է��ϼ��� : ");
	n3 = scan.nextInt();

	//n1�� ���� ���� �� �� ��
	if(n1 < n2){
	  if(n1 < n3){
		System.out.println("���� ���� ���� "+n1);
	  }
	}
	//n2�� ���� ���� �� �� ��
	if(n2 < n1){
	  if(n2 < n3){
		System.out.println("���� ���� ���� "+n2);
	  }
	}
	//n3�� ���� ���� �� �� ��
	if(n3 < n1){
	  if(n3 < n2){
		System.out.println("���� ���� ���� "+n3);
	  }
	}
  }
} 