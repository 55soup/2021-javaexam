/* ������ ���밪�� ���ϴ� ���α׷��� �ۼ��غ���.
�� �� �������� Ű����� �Է¹޴´�. */

import java.util.Scanner; //���밪  -3 => 3    5 => 5
public class Absolute{
  public static void main(String args[ ]){
	int n;  //-5

	Scanner scan = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	n = scan.nextInt();

	if ( n >= 0){
	   System.out.println("���밪 : " + n);
	}else{
	   n*=(-1);   //n = n*(-1);  5 = (-1)*(-5)
	   System.out.println("���밪 : " + n);
	}
  }
}