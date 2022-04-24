/*사각형의 밑변과 높이를 입력 받아 사각형의 넓이를 구하는 프로그램을 작성하라.
(DataTypeTest_04.java)*/

import java.util.Scanner;
public class DataTypeTest_04{
  public static void main(String args[ ]){
	//변수 선언
	double base;
	double height;
	double area;

	//입력
	Scanner scan = new Scanner (System.in);
	//밑변입력
	System.out.print("밑변 입력 : ");
	base = scan.nextDouble();
	//높이입력
	System.out.print("높이 입력 : ");
	height = scan.nextDouble();
	
	area = base*height;
	
	System.out.println("밑변의 넓이 : " + area);	
  }
}