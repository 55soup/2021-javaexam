//원의 넓이와 둘레 구하기
//대문자 => 클래스 이름, 상수


import  java.util.Scanner; 
public class Constant{
	public static void main(String args[ ]){
		//변수 선언
		final double PI = 3.14;//상수 => 변하지 않는 값 , 대문자
		double r = 5.5;
		double area, circum;

		//키보드 입력
		System.out.print("반지름입력: ");
		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble( );

		//계산및 출력 
		area = PI*r*r;
		circum = 2*PI*r;
		System.out.println("반지름" + r + "  인 원의 넓이: " + area + "   둘레 : " + circum);

  	}
}