/*숫자를 입력받고 5의 배수인지 아닌지 판단.*/

import java.util.Scanner;
public class Multiple{
  public static void main(String args[ ]){

	Scanner scan = new Scanner(System.in);
	
	System.out.print("숫자 입력 : ");
	int num = scan.nextInt();

	if(num % 5 == 0){
	   System.out.println(num +"은 5의 배수이다.");
	}else{
	   System.out.println(num +"은 5의 배수가 아니다.");
	}//end of if
	

	
  }
}
