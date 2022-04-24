/*
 * 자바 점수를 입력 받아 등수를 구하는 성적처리 프로젝트를 시도해보자.
 * 조건은 다음과 같다.
 * 1. 학생의 학번, 자바점수, 등수는 2차원 배열(int score[10][3])에 저장한다.
 * 2. 학급당 학생수는 최대 10명이다.
 * 3. 세 과목은 국어, 영어, 자바이며 0~100점 사이의 점수를 갖는다.
 * 4. 점수가 높을 수록 등위가 높다.
 * 5. 모든 성적 처리를 끝내면 1등부터 10등 순서로 출력한다.
 * 6. 순서대로 출력하기 위해 bubble 정렬을 이용한다.
 */
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = new int[][] {
			{1401, 78,1}, {1402, 98,1}, {1403, 76,1},
			{1404, 58,1}, {1405, 100,1}, {1406, 99,1},
			{1407, 45,1}, {1408, 64,1}, {1409, 100,1},
			{1410, 88,1}
		};
		
		//inputscore();
		printResult(score);
		getRank(score);
		doSortBubble(score);
		printResult(score);
	}
	public static void getRank(int[][] score) {
		// TODO Auto-generated method stub
		int[] temp = new int[3];
		
//		for(int i=0; i<score.length-1; i++) {
//			for(int j=i+1; j<score.length; j++) {
//				if(score[i][1]>score[j][1]) {
//					++score[j][2];
//				}else if(score[i][1]<score[j][1]){
//					++score[i][2];
//				}
//			}
//		}
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i][1] < score[j][1]) {
					score[i][2] += 1;
				}
			}
		}
		System.out.println("****** 성적 처리 결과 ******\n");
		System.out.println("학번\t자바점수\t등수");
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
	
	public static void doSortBubble(int[][] score) {
		// TODO Auto-generated method stub
		int temp[] = new int[3];
		
//		for(int i=score.length-1; i>1; i--) {
//			for(int j=0; j<i; j++) {
//				if(score[j][2] > score[j+1][2]) {
//					//두 행을 바꿔라... 
//					for(int k=0; k<3; k++) {
//						temp[k] = score[j][k];
//						score[j][k] = score[j+1][k];
//						score[j+1][k] = temp[k];
//					}
//				}
//			}
//		}
		// for문 바꾸기
		for(int i=0; i<score.length-1; i++) {
			for(int j=9; j>i; j--) {
				if(score[j][2] < score[j-1][2]) {
					//두 행을 바꿔라... 
					for(int k=0; k<3; k++) {
						temp[k] = score[j][k];
						score[j][k] = score[j-1][k];
						score[j-1][k] = temp[k];
					}
				}
			}
		}
	}
	
	public static void printResult(int[][] score) {
		// TODO Auto-generated method stub
		System.out.println("****** 성적 처리 결과 ******\n");
		System.out.println("학번\t자바점수\t등수");
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
