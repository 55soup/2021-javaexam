/*정수 두 개를 입력받아 큰 값을 구하는 프로그램 작성 if*/

import java.util.Scanner;
public class MaxIfElse{
  public static void main(String args[ ]){
	//변수 선언
	int a;   //int a,b;
	int b;
	Scanner scan = new Scanner(System.in);

	//입력
	System.out.print("수1 입력 : ");
	a = scan.nextInt();
	System.out.print("수2 입력 : ");
	b = scan.nextInt();

	//두 수 비교
	if(a>b){
	   System.out.println("큰 수 : "+a);
	}else{ // a<=b:같은 경우가 없다고 가정
	   System.out.println("큰 수 : "+b);
	}

  }
}