/*세 정수를 입력 받아 가장 작은 값을 구하기
   (MinOfThree.java) 
*****2차 실기 테스트에 나옴*/
//Scanner 객체를 이용하여 입력 받기, 같은 수 입력 없다고 가정
//중첩 if문 (if문장 안에 if문)을 사용하기.

import java.util.Scanner;
public class MinOfThree{
  public static void main(String args[ ]){

	//변수 선언
	int n1,n2,n3;
	Scanner scan = new Scanner(System.in);

	//입력
	System.out.print("첫 번째 수를 입력하세요 : ");
	n1 = scan.nextInt();
	System.out.print("두 번째 수를 입력하세요 : ");
	n2 = scan.nextInt();
	System.out.print("세 번째 수를 입력하세요 : ");
	n3 = scan.nextInt();

	//n1이 가장 작은 수 일 때
	if(n1 < n2){
	  if(n1 < n3){
		System.out.println("가장 작은 수는 "+n1);
	  }
	}
	//n2가 가장 작은 수 일 때
	if(n2 < n1){
	  if(n2 < n3){
		System.out.println("가장 작은 수는 "+n2);
	  }
	}
	//n3가 가장 작은 수 일 때
	if(n3 < n1){
	  if(n3 < n2){
		System.out.println("가장 작은 수는 "+n3);
	  }
	}
  }
} 