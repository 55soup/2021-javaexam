/*입력받은 양의 정수가 3의 배수, 5의 배수, 혹은 8의 배수인지를 알려주는 
프로그램을 설계하고 작성하라. 양의 정수가 3의 배수이면 '3의 배수이다"를
출려갛고, 5의 배수이면 '5의 배수이다'를 출력하고, 8의 배수이면 '8의 배수이다'를
출력하라. 그 외의 경우이면 '어느 배수도 아니다'를 출력하라*/
/*If 문장을 이용하여 작성하라.
   Multiple_if.java
   number : 입력 받은 수
   공배수는 고려하지 않고 작성한다.*/

import java.util.Scanner;
public class Multiple_if{
  public static void main(String args[]){

	int number;
	Scanner scan = new Scanner(System.in);

	System.out.print("수를 입력하세요 : ");
	number = scan.nextInt();

	if(number % 3 == 0){
	   System.out.println("3의 배수이다.");
	}else if(number % 5 == 0){
	   System.out.println("5의 배수이다.");
	}else if(number % 8 == 0){
	   System.out.println("8의 배수이다.");
	}else{
	   System.out.println("어느 배수도 아니다.");
	}
  }
}