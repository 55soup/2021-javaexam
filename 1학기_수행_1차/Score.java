/*시험점수를 입력받고, 국어/영어/수학 합계와 평균(실수)내기.*/

import java.util.Scanner;
public class Score{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);
	
	System.out.print("국어점수 : ");
	int kor = scan.nextInt();
	System.out.print("영어점수 : ");
	int eng = scan.nextInt();
	System.out.print("수학점수 : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	double wal = (kor + eng + math)/3.0;

	System.out.println("합계 : "+sum);
	System.out.println("평균 : "+wal);

	if(wal >= 80){
	  System.out.println("우수");
	}else{
	  System.out.println("노력 요함");
	}
			
  }
}
