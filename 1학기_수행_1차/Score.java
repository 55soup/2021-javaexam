/*���������� �Է¹ް�, ����/����/���� �հ�� ���(�Ǽ�)����.*/

import java.util.Scanner;
public class Score{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);
	
	System.out.print("�������� : ");
	int kor = scan.nextInt();
	System.out.print("�������� : ");
	int eng = scan.nextInt();
	System.out.print("�������� : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	double wal = (kor + eng + math)/3.0;

	System.out.println("�հ� : "+sum);
	System.out.println("��� : "+wal);

	if(wal >= 80){
	  System.out.println("���");
	}else{
	  System.out.println("��� ����");
	}
			
  }
}
