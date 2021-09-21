/*10명의 점수를 입력 받아 최고점수를 받은 학생을 결정하는 프로그램을 작성하라.*/
/*1. Scanner 를 통해 입력마다 score배열에 점수를 저장하라.
 * 2. score배열은 정수형이고 길이는 10이다.
 * 3. 최대값을 결정하기 위한 변수max를 사용하라.*/


import java.util.Scanner;
public class Array_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []score = new int[10]; //점수를 입력받을 배열
		int max=0; //최댓값
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.print((10-i)+"명의 점수를 입력하세요:");//점수입력할 사람이 몇 명 남았는지 출력.
			score[i]=scan.nextInt();
			if(max < score[i]){//만약 최댓값이 점수보다 작을경우
				max = score[i]; //최댓값변수 안에 점수를 넣음.
			}
		}
		System.out.println("최고점수를 받은 학생의 점수는 "+max +"점입니다.");
		
		
	}

}

