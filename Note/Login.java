/*성별을 입력받아 여성(0)인 경우만 로그인이 가능*/

import java.util.Scanner;
public class Login{
  public static void main(String args[ ]){
	//변수 선언
	int input;
	Scanner scan = new Scanner(System.in);

	//입력
	System.out.print("성별 입력(여성 => 0) : ");
	input = scan.nextInt();	
	
	// => if만 이용
	if (input == 0){
		System.out.println("여성이므로 로그인이 가능합니다.");
	}

  }
}