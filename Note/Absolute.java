/* 정수의 절대값을 구하는 프로그램을 작성해보자.
이 때 정수값을 키보드로 입력받는다. */

import java.util.Scanner; //절대값  -3 => 3    5 => 5
public class Absolute{
  public static void main(String args[ ]){
	int n;  //-5

	Scanner scan = new Scanner(System.in);
	System.out.print("숫자 입력 : ");
	n = scan.nextInt();

	if ( n >= 0){
	   System.out.println("절대값 : " + n);
	}else{
	   n*=(-1);   //n = n*(-1);  5 = (-1)*(-5)
	   System.out.println("절대값 : " + n);
	}
  }
}