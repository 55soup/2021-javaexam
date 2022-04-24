/*점수를 입력받아 성취도를 구하는 프로그램을 작성하시오. => switch*/

import java.util.Scanner;
public class AchieveSwitch{
  public static void main(String args[ ]){
	//변수 선언
	int score;
	Scanner scan = new Scanner(System.in);

	//입력
	System.out.print("점수 입력 : ");
	score = scan.nextInt();
	
	//100/10=10  98/10=9 91/10=9 72/10=7
	switch(score/10){   // 5/2 = 2
	   case 10:
	   case 9: System.out.println("성취도 : A"); break;
	   case 8: System.out.println("성취도 : B"); break;
	   case 7: System.out.println("성취도 : C"); break;
	   case 6: System.out.println("성취도 : D"); break;
	   case 5: System.out.println("성취도 : E"); break;
	   default : System.out.println("성취도 : 재수강");
	}

	/*if(score >= 90){
		System.out.println("성취도 : A");
	}else if (score >= 80){ //score<90 && score >=80
		System.out.println("성취도 : B");
	}else if (score >= 70){ //score<80 && score >=70
		System.out.println("성취도 : C");
	}else if (score >= 60){
		System.out.println("성취도 : D");
	}else if (score >= 50){
		System.out.println("성취도 : E");
	}else{
		System.out.println("성취도 : 재수강");
	}*/
		
  }
}