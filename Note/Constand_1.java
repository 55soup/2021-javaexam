/*시험점수를 입력받아 기준점수(85점)이상이면 '통과' , 기준점수 미만이면
'탈락'을 출력하는 프로그램을 작성하라. (Constand_1.java) 단 기준점수는 상수로 정의한다.*/

import java.util.Scanner;
public class Constand_1{
  public static void main(String args[ ]){
	//데이터 => 변수선언, 초기화
	//키보드로 입력받기 때문에 초기화가 필요없음. 조금이라도 메모리를 줄이기 위해서
	int score;
	final int CUTLINE = 85;
	
	//입력
	System.out.print("점수 입력 : ");
	Scanner scan = new Scanner (System.in);
	score = scan.nextInt( );

	//처리  => 조건문 if(조건 참) - else(조건 거짓)
	if(score >= CUTLINE){
		//통과
		System.out.println("통과");
	}else{
		//탈락
		System.out.println("탈락");
	}
//에러는 맨 위에서 부터 고치는 것. 
	
	
  }
}