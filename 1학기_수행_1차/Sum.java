/*1에서 입력받은 숫자까지의 합*/

import java.util.Scanner;
public class Sum{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);
	int sum = 0;

	System.out.print("숫자 입력 : ");
	int n = scan.nextInt();

	for(int num = 1; num <=n; num++){
	
	sum += num;
	
	}
	System.out.println(sum);

	
  }
}
