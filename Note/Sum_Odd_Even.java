/*1부터 입력받은 숫자사이에 존재하는 홀수의합, 짝수의 합을 구하시오.*/
//예) 1부터 5사이의 홀수의 합 : 1+3+5 = 9, 1부터 5까지의 짝수의 합 2+4 = 6

import java.util.Scanner;
public class Sum_Odd_Even{
  public static void main(String args[ ]){
	int num;
	int odd_sum = 0;  //홀수들의 합
	int even_sum = 0; //짝수들의 합
	Scanner scan = new Scanner(System.in);
	
	System.out.print("수를 입력하세요 : ");
	num = scan.nextInt();

	for ( int i =1; i<=num; i++){ //1,2,3,4,..........n
	   switch(i%2){
	     case 0: even_sum += i; break;
	     case 1: odd_sum += i; break;
	     default : System.out.println("숫자가 아닙니다.");
	 }//end of switch

	   /*if(i%2==0){
		even_sum += i; //누적합
	      }else{
		odd_sum += i;
	     }*/

	}//end of for

	System.out.println("1부터 "+num+" 까지 홀수의 합 : "+odd_sum);
	System.out.println("1부터 "+num+" 까지 짝수의 합 : "+even_sum);
		
  }
}