package array_2;

import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[5][5];
		score = inputScore(score); // 0열2열 점수 부분
		score = getSumScore(score); // 3열 점수합 부분
		score = getRank(score); // 4열 등수 부분
		printResult(score);
		
	}

	public static int[][] inputScore (int[][] score) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] item = {"완성도","창의성","이해도"};
		
		System.out.println("0~20점 사이의 점수를 입력하세요.");
		//입력
		for(int i=0; i<score.length; i++) {
			System.out.println("========================================================");
			System.out.println(i+1 + "조"); // 조 출력
			for(int j=0; j<3; j++) {
				System.out.print(item[j]+" 점수를 입력하세요: ");  // 평가항목 출력
				score[i][j]= scan.nextInt(); // score[0][0]~score[0][2] / score[1][0]~score[1][2] / score[2][0]~score[2][2]
				
				if(score[i][j]<0 || score[i][j]>20) {//유효성 검사
					System.out.println("0~20점 사이의 수를 입력하세요.");
					--j;
				}
			}
		}
		return score;
	}

	public static int[][] getSumScore(int[][] score) {
		// TODO Auto-generated method stub
		for(int i=0; i<score.length; i++) { 
			for(int j=0; j<3; j++) {
				score[i][3] += score[i][j];
				
			}
		}
		return score;
	}
	
	public static int[][] getRank(int[][] score) {
		// TODO Auto-generated method stub
		for(int i=0; i<score.length; i++) {// 등수 값을 1로 초기화
			score[i][4]=1;
		}
		
		for(int i=0; i<score.length-1; i++) {
         	for(int j=i+1; j<score.length; j++) {
         		
         		if(score[i][3]<score[j][3]) // 총점이 낮을경우 랭킹이 뒤로 밀려남.
         			++score[i][4];
				else if(score[i][3]>score[j][3]) 
					++score[j][4];
         		else if(score[i][3]==score[j][3]) //동점일 경우 랭킹이 같아야함.
         			score[j][4]=score[i][4];
         		
         	}
		 }
		return score;
	}
	
	public static void printResult (int[][] score) {
		// TODO Auto-generated method stub
		System.out.println("최고팀은: ");
		
		for(int i=0; i<score.length; i++) {
			if(score[i][4]==1) // 공동 1등인 경우도 염두
				System.out.println((i+1)+"조  "+"=> 총 점수: "+score[i][3]);
		}
		System.out.print("입니다.");
	}

}
