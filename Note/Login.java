/*������ �Է¹޾� ����(0)�� ��츸 �α����� ����*/

import java.util.Scanner;
public class Login{
  public static void main(String args[ ]){
	//���� ����
	int input;
	Scanner scan = new Scanner(System.in);

	//�Է�
	System.out.print("���� �Է�(���� => 0) : ");
	input = scan.nextInt();	
	
	// => if�� �̿�
	if (input == 0){
		System.out.println("�����̹Ƿ� �α����� �����մϴ�.");
	}

  }
}