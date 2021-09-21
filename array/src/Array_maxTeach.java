/*10명의 점수를 입력 받아 최고점수를 받은 학생을 결정하는 프로그램을 작성하라.*/
/*1. Scanner 를 통해 입력마다 score배열에 점수를 저장하라.
 * 2. score배열은 정수형이고 길이는 10이다.
 * 3. 최대값을 결정하기 위한 변수max를 사용하라.*/
import java.util.Scanner;

public class Array_maxTeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수
		int[] score = new int[10];
		int max=0; //정수0~100
		int count=0;
		Scanner scan = new Scanner(System.in);
		
		// 2.반복문
		//while(count<10) {
			for(int i=0; i<score.length; i++) {
				System.out.print("점수입력 : ");
				score[i] = scan.nextInt();
				
				if(score[i]<0 || score[i]>100) {//0~100의 점수 판단을 먼저.
					System.out.println("0에서 100사이에 수를 입력하세요");
					//if(i==0) break;
					i--;  //인덱스 -1에서  for문을 한번 더 돌리고 i++
				}else if(score[i] > max) {//max숫자를 나중에 넣기 -> max가 나중에 들어가야 판단을 하기 쉬움
					max=score[i]; //else if(x) if문을 쓸경우, 
				}
				//count++;
			}
		//}

		//3. 출력
		for(int i=0; i<score.length; i++) {
			System.out.println("점수" + (i+1) + " : "+score[i]);
		}
		System.out.println("최고점수 : "+max);
	}

}
