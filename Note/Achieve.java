/*������ �Է¹޾� ���뵵�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

import java.util.Scanner;
public class Achieve{
  public static void main(String args[ ]){
	//���� ����
	int score;
	Scanner scan = new Scanner(System.in);

	//�Է�
	System.out.print("���� �Է� : ");
	score = scan.nextInt();

	if(score >= 90){
		System.out.println("���뵵 : A");
	}else if (score >= 80){ //score<90 && score >=80
		System.out.println("���뵵 : B");
	}else if (score >= 70){ //score<80 && score >=70
		System.out.println("���뵵 : C");
	}else if (score >= 60){
		System.out.println("���뵵 : D");
	}else if (score >= 50){
		System.out.println("���뵵 : E");
	}else{
		System.out.println("���뵵 : �����");
	}
		
  }
}