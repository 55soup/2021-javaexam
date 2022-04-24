/*정수의 절댓값을 구하는 프로그램을 작성해보자
이 때 정수값을 키보드로 입력받는다. */

import java.util.Scanner;
public class Absolute_test{
  public static void main(String args[ ] ){

    int n;
	for(int i = 1; i<=5; i++){
	   Scanner scan = new Scanner(System.in);
	   System.out.print("숫자입력 :");
	   n = scan.nextInt( ); 
	   //int n = scan.nextInt(); 선언과 동시에 입력
	   if (n >=0){
	       System.out.println("절대값 :" + n);
	    } else {
	       n*=(-1); //<복합대입연산자 n = n(-1); / 5=  (-1)(-5)
	    System.out.println("절대값 :" + n);
    	    }//end of if
    	}//end of for
  }//end of main
}//end of class