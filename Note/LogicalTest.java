/* 키보드로 부터 나이, 성별을 입력받아 
    여자이거나 나이가 18세 미만이면 "회원가입 가능"이라고 출력
    그렇지 않으면 "회원가입 불가"라고 출력*/

import java.util.Scanner;
public class LogicalTest{
  public static void main(String args[ ]){
	//데이터 => 나이, 성별
	int age;
	int gender; //여자 1 남자 0

	//입력
	Scanner scan = new Scanner(System.in);
	System.out.print("나이 입력 : ");
	age = scan.nextInt();
	System.out.print("성별 입력 : ");
	gender = scan.nextInt();

	//처리
	if(gender==1 || age <18){
	  System.out.println("회원가입 가능");
	}else{
	   System.out.println("회원가입 불가");
	}
  }
}