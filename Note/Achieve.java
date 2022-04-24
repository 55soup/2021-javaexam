/*점수를 입력받아 성취도를 구하는 프로그램을 작성하시오.*/

import java.util.Scanner;
public class Achieve{
  public static void main(String args[ ]){
	//변수 선언
	int score;
	Scanner scan = new Scanner(System.in);

	//입력
	System.out.print("점수 입력 : ");
	score = scan.nextInt();

	if(score >= 90){
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
	}
		
  }
}