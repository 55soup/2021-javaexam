/*������ ������ ���ϴ� ���α׷��� �ۼ��غ���
�� �� �������� Ű����� �Է¹޴´�. */

import java.util.Scanner;
public class Absolute_test{
  public static void main(String args[ ] ){

    int n;
	for(int i = 1; i<=5; i++){
	   Scanner scan = new Scanner(System.in);
	   System.out.print("�����Է� :");
	   n = scan.nextInt( ); 
	   //int n = scan.nextInt(); ����� ���ÿ� �Է�
	   if (n >=0){
	       System.out.println("���밪 :" + n);
	    } else {
	       n*=(-1); //<���մ��Կ����� n = n(-1); / 5=  (-1)(-5)
	    System.out.println("���밪 :" + n);
    	    }//end of if
    	}//end of for
  }//end of main
}//end of class