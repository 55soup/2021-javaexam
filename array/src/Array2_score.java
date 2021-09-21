//+ 최고팀에 이어 2등 3등과 총 점수를 출력한다.
//+ 같은 점수의 팀인 경우 숫자가 더 많은 팀이 뒤에 등수로 밀려난다. ex) 2등-3조 : 30점,  3등-5조 : 30점 
//+ 평균 출력 ㄲ?
import java.util.Scanner;
public class Array2_score{
	public static void main(String args[]) {
		
		int[][] score = new int[5][3]; //점수
		int[] sum = new int[5]; //총점
		int[] rank = {1,1,1,1,1};
		double[] ave = new double[5];
		
		score = input(score); //입력
		sum = resultSum(score, sum); //팀당 총 점수
		ave = resultAve(score, sum, ave);
		rank = take_rank(score, sum, rank); //등수
		print_result(score, rank, sum, ave); //결과 출력
	}
	
	public static int[][] input(int[][] score) {//입력
		Scanner scan = new Scanner(System.in);
		String[] item = {"완성도","창의성","이해도"};
		
		//입력
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1 + "조");
			for(int j=0; j<score[i].length; j++) {
				
				System.out.print(item[j]+" 점수를 입력하세요: ");
				score[i][j]= scan.nextInt();
				
				if(score[i][j]<0 || score[i][j]>20) {//유효성 검사
					System.out.println("0~20점 사이의 수를 입력하세요.");
					--j;
				}
			}
		}
		return score;
	}
	public static int[] resultSum(int[][] score, int[] sum) {//팀 당 총 점수
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
		}
		return sum;
	}
	public static double[] resultAve(int[][] score, int[] sum, double[] ave) {
		
		for(int i=0; i<score.length; i++) {
				ave[i] = (double)sum[i]/3; // int[] sum -> 형변환  double[] sum
		}
		return ave;
	}
	
	public static int[] take_rank(int[][] score, int[] sum, int[] rank) {//등수
		//등수구하기
		for(int i=0; i<score.length-1; i++) {
         	for(int j=i+1; j<score.length; j++) {
         		if(sum[i]<sum[j])
         			++rank[i];
         		else if(sum[i]>sum[j])
         			++rank[j];
         		else if(sum[i]==sum[j])
         			++rank[j]; //같은 점수의 팀인 경우 숫자가 더 많은 팀이 뒤에 등수로 밀려난다.
         	}
		 }
	 return rank;
	}
	
	public static void print_result(int[][] score, int[] rank, int[] sum, double[] ave) {//결과
		int[] print_rank = new int[3];
		double temp;

		//등수 1~3등 까지 출력!
		for(int i=0; i<score.length; i++) { 
			
			switch(rank[i]) {
			case 1: print_rank[0] = i+1; break;
			case 2: print_rank[1] = i+1; break;
			case 3: print_rank[2] = i+1; break;
			}
		}
		for(int i=0; i<score.length-1; i++) { // 총 점수 내림차순 정렬
			for(int j=i+1; j<score.length; j++) {
				if(sum[i] < sum[j]) {
					temp = sum[i];
					sum[i] = sum[j];
					sum[j] = (int)temp;
				}
			}
		}
		
		for(int i=0; i<score.length-1; i++) { // 점수 내림차순 정렬
			for(int j=i+1; j<score.length; j++) {
				if(ave[i] < ave[j]) {
					temp = ave[i];
					ave[i] = ave[j];
					ave[j] = temp;
				}
			}
		}
		System.out.println("최고팀: "+print_rank[0]+"조 -> 총 점수 : "+ sum[0]+"점, 평균: "+ave[0]);
		System.out.println("최고팀: "+print_rank[1]+"조 -> 총 점수 : "+ sum[1]+"점, 평균: "+ave[1]);
		System.out.println("최고팀: "+print_rank[2]+"조 -> 총 점수 : "+ sum[2]+"점, 평균: "+ave[2]);
	}
	
}