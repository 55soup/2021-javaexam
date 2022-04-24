/*1부터 입력받은 숫자까지의 합*/

import java.util.Scanner;
public class Sum{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);
	
	System.out.print("숫자를 입력하세요 : ");
	int num = scan.nextInt();

	int sum = 0;

	for(int i = 1; i <= num; i++){
	   sum += i;
	 }
	System.out.println("1부터" + num+"까지의 합은 = "+sum);
	
  }
}