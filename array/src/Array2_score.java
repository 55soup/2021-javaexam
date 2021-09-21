//+ �ְ����� �̾� 2�� 3��� �� ������ ����Ѵ�.
//+ ���� ������ ���� ��� ���ڰ� �� ���� ���� �ڿ� ����� �з�����. ex) 2��-3�� : 30��,  3��-5�� : 30�� 
//+ ��� ��� ��?
import java.util.Scanner;
public class Array2_score{
	public static void main(String args[]) {
		
		int[][] score = new int[5][3]; //����
		int[] sum = new int[5]; //����
		int[] rank = {1,1,1,1,1};
		double[] ave = new double[5];
		
		score = input(score); //�Է�
		sum = resultSum(score, sum); //���� �� ����
		ave = resultAve(score, sum, ave);
		rank = take_rank(score, sum, rank); //���
		print_result(score, rank, sum, ave); //��� ���
	}
	
	public static int[][] input(int[][] score) {//�Է�
		Scanner scan = new Scanner(System.in);
		String[] item = {"�ϼ���","â�Ǽ�","���ص�"};
		
		//�Է�
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1 + "��");
			for(int j=0; j<score[i].length; j++) {
				
				System.out.print(item[j]+" ������ �Է��ϼ���: ");
				score[i][j]= scan.nextInt();
				
				if(score[i][j]<0 || score[i][j]>20) {//��ȿ�� �˻�
					System.out.println("0~20�� ������ ���� �Է��ϼ���.");
					--j;
				}
			}
		}
		return score;
	}
	public static int[] resultSum(int[][] score, int[] sum) {//�� �� �� ����
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
		}
		return sum;
	}
	public static double[] resultAve(int[][] score, int[] sum, double[] ave) {
		
		for(int i=0; i<score.length; i++) {
				ave[i] = (double)sum[i]/3; // int[] sum -> ����ȯ  double[] sum
		}
		return ave;
	}
	
	public static int[] take_rank(int[][] score, int[] sum, int[] rank) {//���
		//������ϱ�
		for(int i=0; i<score.length-1; i++) {
         	for(int j=i+1; j<score.length; j++) {
         		if(sum[i]<sum[j])
         			++rank[i];
         		else if(sum[i]>sum[j])
         			++rank[j];
         		else if(sum[i]==sum[j])
         			++rank[j]; //���� ������ ���� ��� ���ڰ� �� ���� ���� �ڿ� ����� �з�����.
         	}
		 }
	 return rank;
	}
	
	public static void print_result(int[][] score, int[] rank, int[] sum, double[] ave) {//���
		int[] print_rank = new int[3];
		double temp;

		//��� 1~3�� ���� ���!
		for(int i=0; i<score.length; i++) { 
			
			switch(rank[i]) {
			case 1: print_rank[0] = i+1; break;
			case 2: print_rank[1] = i+1; break;
			case 3: print_rank[2] = i+1; break;
			}
		}
		for(int i=0; i<score.length-1; i++) { // �� ���� �������� ����
			for(int j=i+1; j<score.length; j++) {
				if(sum[i] < sum[j]) {
					temp = sum[i];
					sum[i] = sum[j];
					sum[j] = (int)temp;
				}
			}
		}
		
		for(int i=0; i<score.length-1; i++) { // ���� �������� ����
			for(int j=i+1; j<score.length; j++) {
				if(ave[i] < ave[j]) {
					temp = ave[i];
					ave[i] = ave[j];
					ave[j] = temp;
				}
			}
		}
		System.out.println("�ְ���: "+print_rank[0]+"�� -> �� ���� : "+ sum[0]+"��, ���: "+ave[0]);
		System.out.println("�ְ���: "+print_rank[1]+"�� -> �� ���� : "+ sum[1]+"��, ���: "+ave[1]);
		System.out.println("�ְ���: "+print_rank[2]+"�� -> �� ���� : "+ sum[2]+"��, ���: "+ave[2]);
	}
	
}