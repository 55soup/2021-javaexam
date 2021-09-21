package 조건문;
/*	은행업무인 '1)입금 2)출금 3)잔액조회 4)종료' 를 메뉴에 나타내고,
	사용자의 숫자 입력을 통해 업무를 볼 수 있도록 한다.
	
	이때 입금, 출금, 잔액조회에서는 사용자에게 비밀번호(1234)를 요구하게 된다.
	비밀번호를 5번 틀릴경우 은행업무를 볼 수 없다. 틀린 횟수를 안내문자로 내보낸다.

  	출금의 경우에서 인출 금액이 잔액보다 클 경우 안내 문구를 내보낸다.
  	또한 계좌에 가지고 있는 돈이 없는 경우에도 안내 문구를 내보낸다. */

import java.util.Scanner;
public class Bankbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int service;
		int input;
		int output;
		int money=0;
		int password;
		int count=5;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1)입금   "+"2)출금   "+"3)잔액조회   "+"4)종료" );
		
		while(true) {
			System.out.print("이용하실 서비스를 숫자로 입력해주세요 : ");
			service = scan.nextInt();
			if(service == 4) break; //종료 비밀번호입력없이 끝내야하기 때문에 앞에 적음.
			
			while(count > 0) {	
				System.out.print("비밀번호를 입력하세요 : ");
				password = scan.nextInt();
			if(password == 1234) {
				switch(service) {
				case 1 : System.out.print("얼마를 입금하시겠습니까? : "); //입금
						 input = scan.nextInt();
						 money += input;
						 break;
						 
				case 2 : if(money<=0) {//출금
							System.out.println("죄송합니다. 출금하실 수 있는 금액이 없습니다.");
							break;
						}
						 System.out.print("얼마를 출금하시겠습니까? : ");
						 output = scan.nextInt();
						 if(output > money) {
							 System.out.println("출금하려는 금액이 저금되어있는 금액보다 큽니다.");
							 break; 
						 }else {
							money -= output; //계좌에서 입력한 금액만큼 빠져나감.
						 	break;
						 }
						 
				case 3 : System.out.println
				("현재 가지고 계신 금액은 : "+ money+" 원 입니다."); break; //잔액조회
				default : System.out.println("잘못된 숫자를 입력하였습니다.");
				}break; //서비스를 다 마치고 나올때
				
				}else {
					count --;
					System.out.println("비밀번호가 틀렸습니다." + "입력횟수가 "+count+" 번 남았습니다.");
				}
			}
			if(count == 0) break;
		}
		
	
		
	}

}
