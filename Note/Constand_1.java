/*���������� �Է¹޾� ��������(85��)�̻��̸� '���' , �������� �̸��̸�
'Ż��'�� ����ϴ� ���α׷��� �ۼ��϶�. (Constand_1.java) �� ���������� ����� �����Ѵ�.*/

import java.util.Scanner;
public class Constand_1{
  public static void main(String args[ ]){
	//������ => ��������, �ʱ�ȭ
	//Ű����� �Է¹ޱ� ������ �ʱ�ȭ�� �ʿ����. �����̶� �޸𸮸� ���̱� ���ؼ�
	int score;
	final int CUTLINE = 85;
	
	//�Է�
	System.out.print("���� �Է� : ");
	Scanner scan = new Scanner (System.in);
	score = scan.nextInt( );

	//ó��  => ���ǹ� if(���� ��) - else(���� ����)
	if(score >= CUTLINE){
		//���
		System.out.println("���");
	}else{
		//Ż��
		System.out.println("Ż��");
	}
//������ �� ������ ���� ��ġ�� ��. 
	
	
  }
}