/* 10���� ������ �Է� �޾� �������� ���� ������ �����ϴ� ���α׷��� �ۼ��϶�.
 * 1. Scanner�� ���� 10���� ������ �Է� �޾� score �迭�� ������ �����϶�.
 * 2. ��ȿ�� ����(0-100��)�� �Է��Ѵٰ� ��������.
 * 3. �迭 ����� ��������(selection sort)�� �̿��϶�.
 * 4. ���������̶� ���� �������� ���� ���� ������ �����ϴ� ���� �ǹ��Ѵ�.*/
import java.util.Scanner;

public class Array_sort_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ����
		int[] score = new int[10];
		int max=0; //����0~100
		int count=0;
		Scanner scan = new Scanner(System.in);
		
		// 2.�ݺ���
			for(int i=0; i<score.length; i++) {
				System.out.print("�����Է� : ");
				score[i] = scan.nextInt();
				
				if(score[i]<0 || score[i]>100) {//0~100�� ���� �Ǵ��� ����.
					System.out.println("0���� 100���̿� ���� �Է��ϼ���");
					//if(i==0) break;
					i--;
				}else if(score[i] > max) {//max���ڸ� ���߿� �ֱ� -> max�� ���߿� ���� �Ǵ��� �ϱ� ����
					max=score[i];
				}
			
			}
		score_sort(score);
		for(int i=0; i<score.length; i++) {
			//System.out.print(score[i]+"\t");
			System.out.println(score[i]+"��");
		}
		
	}//end of main
	public static int[] score_sort(int score[]) {
		//3. ��� ��������
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