/*10���� ������ �Է� �޾� �ְ������� ���� �л��� �����ϴ� ���α׷��� �ۼ��϶�.*/
/*1. Scanner �� ���� �Է¸��� score�迭�� ������ �����϶�.
 * 2. score�迭�� �������̰� ���̴� 10�̴�.
 * 3. �ִ밪�� �����ϱ� ���� ����max�� ����϶�.*/
import java.util.Scanner;

public class Array_maxTeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ����
		int[] score = new int[10];
		int max=0; //����0~100
		int count=0;
		Scanner scan = new Scanner(System.in);
		
		// 2.�ݺ���
		//while(count<10) {
			for(int i=0; i<score.length; i++) {
				System.out.print("�����Է� : ");
				score[i] = scan.nextInt();
				
				if(score[i]<0 || score[i]>100) {//0~100�� ���� �Ǵ��� ����.
					System.out.println("0���� 100���̿� ���� �Է��ϼ���");
					//if(i==0) break;
					i--;  //�ε��� -1����  for���� �ѹ� �� ������ i++
				}else if(score[i] > max) {//max���ڸ� ���߿� �ֱ� -> max�� ���߿� ���� �Ǵ��� �ϱ� ����
					max=score[i]; //else if(x) if���� �����, 
				}
				//count++;
			}
		//}

		//3. ���
		for(int i=0; i<score.length; i++) {
			System.out.println("����" + (i+1) + " : "+score[i]);
		}
		System.out.println("�ְ����� : "+max);
	}

}
