/*숫자를 입력받고 5의 배수인지 아닌지 판단.*/

import java.util.Scanner;
public class Multiple{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);

	System.out.print("숫자를 입력하세요 : ");
	int num5 = scan.nextInt();

	String judge = (num5 % 5 == 0)?"5의 배수입니다.":"5의 배수가 아닙니다.";
	System.out.println(judge);
	
  }
}