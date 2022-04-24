/*
 * �ڹ� ������ �Է� �޾� ����� ���ϴ� ����ó�� ������Ʈ�� �õ��غ���.
 * ������ ������ ����.
 * 1. �л��� �й�, �ڹ�����, ����� 2���� �迭(int score[10][3])�� �����Ѵ�.
 * 2. �б޴� �л����� �ִ� 10���̴�.
 * 3. �� ������ ����, ����, �ڹ��̸� 0~100�� ������ ������ ���´�.
 * 4. ������ ���� ���� ������ ����.
 * 5. ��� ���� ó���� ������ 1����� 10�� ������ ����Ѵ�.
 * 6. ������� ����ϱ� ���� bubble ������ �̿��Ѵ�.
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
		System.out.println("****** ���� ó�� ��� ******\n");
		System.out.println("�й�\t�ڹ�����\t���");
		
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
//					//�� ���� �ٲ��... 
//					for(int k=0; k<3; k++) {
//						temp[k] = score[j][k];
//						score[j][k] = score[j+1][k];
//						score[j+1][k] = temp[k];
//					}
//				}
//			}
//		}
		// for�� �ٲٱ�
		for(int i=0; i<score.length-1; i++) {
			for(int j=9; j>i; j--) {
				if(score[j][2] < score[j-1][2]) {
					//�� ���� �ٲ��... 
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
		System.out.println("****** ���� ó�� ��� ******\n");
		System.out.println("�й�\t�ڹ�����\t���");
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
