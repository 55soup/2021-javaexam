/*���������� �Է¹ް�, ����/����/���� �հ�� ���(�Ǽ�)����.
��� 85�� �̻��̸� ��� �ƴϸ� Ż��*/

import java.util.Scanner;
public class Score{
  public static void main(String args[ ]){
	Scanner scan = new Scanner(System.in);

	System.out.print("���� ���� �Է� : ");
	int kor = scan.nextInt();
	System.out.print("���� ���� �Է� : ");
	int eng = scan.nextInt();
	System.out.print("���� ���� �Է� : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	double sum2= (kor + eng + math)/3;

	System.out.println("�հ�� : " +sum );
	System.out.println("����� : "+sum2 );

	String judge = (sum2 >= 85)?"���":"Ż��";
	System.out.println(judge);
	
	
  }
}