/*������ �Է¹޾� ���뵵�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. => switch*/

import java.util.Scanner;
public class AchieveSwitch{
  public static void main(String args[ ]){
	//���� ����
	int score;
	Scanner scan = new Scanner(System.in);

	//�Է�
	System.out.print("���� �Է� : ");
	score = scan.nextInt();
	
	//100/10=10  98/10=9 91/10=9 72/10=7
	switch(score/10){   // 5/2 = 2
	   case 10:
	   case 9: System.out.println("���뵵 : A"); break;
	   case 8: System.out.println("���뵵 : B"); break;
	   case 7: System.out.println("���뵵 : C"); break;
	   case 6: System.out.println("���뵵 : D"); break;
	   case 5: System.out.println("���뵵 : E"); break;
	   default : System.out.println("���뵵 : �����");
	}

	/*if(score >= 90){
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
	}*/
		
  }
}