/*10���� ������ �Է� �޾� �ְ������� ���� �л��� �����ϴ� ���α׷��� �ۼ��϶�.*/
/*1. Scanner �� ���� �Է¸��� score�迭�� ������ �����϶�.
 * 2. score�迭�� �������̰� ���̴� 10�̴�.
 * 3. �ִ밪�� �����ϱ� ���� ����max�� ����϶�.*/


import java.util.Scanner;
public class Array_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []score = new int[10]; //������ �Է¹��� �迭
		int max=0; //�ִ�
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.print((10-i)+"���� ������ �Է��ϼ���:");//�����Է��� ����� �� �� ���Ҵ��� ���.
			score[i]=scan.nextInt();
			if(max < score[i]){//���� �ִ��� �������� �������
				max = score[i]; //�ִ񰪺��� �ȿ� ������ ����.
			}
		}
		System.out.println("�ְ������� ���� �л��� ������ "+max +"���Դϴ�.");
		
		
	}

}

