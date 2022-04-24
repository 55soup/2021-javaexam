/*시험점수를 입력받고, 국어/영어/수학 합계와 평균(실수)내기.
평균 85점 이상이면 통과 아니면 탈락*/

import java.util.Scanner;
public class Score{
  public static void main(String args[ ]){
	Scanner scan = new Scanner(System.in);

	System.out.print("국어 점수 입력 : ");
	int kor = scan.nextInt();
	System.out.print("영어 점수 입력 : ");
	int eng = scan.nextInt();
	System.out.print("수학 점수 입력 : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	double sum2= (kor + eng + math)/3;

	System.out.println("합계는 : " +sum );
	System.out.println("평균은 : "+sum2 );

	String judge = (sum2 >= 85)?"통과":"탈락";
	System.out.println(judge);
	
	
  }
}