/* 10명의 점수를 입력 받아 오름차순 으로 점수를 정렬하는 프로그램을 작성하라.
 * 1. Scanner를 통해 10명의 점수를 입력 받아 score 배열에 점수를 저장하라.
 * 2. 유효한 점수(0-100점)만 입력한다고 가정하자.
 * 3. 배열 방법은 선택정렬(selection sort)을 이용하라.
 * 4. 오름차순이란 낮은 점수에서 높은 점수 순서로 정렬하는 것을 의미한다.*/
import java.util.Scanner;

public class Array_sort_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수
		int[] score = new int[10];
		int max=0; //정수0~100
		int count=0;
		Scanner scan = new Scanner(System.in);
		
		// 2.반복문
			for(int i=0; i<score.length; i++) {
				System.out.print("점수입력 : ");
				score[i] = scan.nextInt();
				
				if(score[i]<0 || score[i]>100) {//0~100의 점수 판단을 먼저.
					System.out.println("0에서 100사이에 수를 입력하세요");
					//if(i==0) break;
					i--;
				}else if(score[i] > max) {//max숫자를 나중에 넣기 -> max가 나중에 들어가야 판단을 하기 쉬움
					max=score[i];
				}
			
			}
		score_sort(score);
		for(int i=0; i<score.length; i++) {
			//System.out.print(score[i]+"\t");
			System.out.println(score[i]+"점");
		}
		
	}//end of main
	public static int[] score_sort(int score[]) {
		//3. 출력 오름차순
		int temp;
		for(int i=0; i<score.length-1; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[i] > score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
				return score;
	}
}