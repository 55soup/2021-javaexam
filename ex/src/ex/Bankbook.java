package ex;
/*은행업무인 '1)입금 2)출금 3)잔액조회 4)종료' 를 메뉴에 나타내고,

   출금의 경우에서 인출 금액이 잔액보다 클 경우 안내 문구를 내보낸다.

   이때 입금, 출금, 잔액조회에서는 사용자에게 비밀번호(1234)를 요구하게 된다.*/
/*문제점 : 1. 출금할 금액이 없을 때에 오류
 * 		2. 비밀번호 없이 종료. (해결)
 * 		3. 비밀번호가 틀린횟수를 다른 서비스를 선택했을 때 연동되게 할 것인가 아닐것인가. (연동되게 한다. /안 연동되는 버전을 만들어도 좋을듯.)*/
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
		
		while(count > 0) {
			System.out.print("이용하실 서비스를 숫자로 입력해주세요 : ");
			service = scan.nextInt();
			if(service == 4) break;
			
			while(count > 0) {
				System.out.print("비밀번호를 입력하세요 : ");
				password = scan.nextInt();
				if(password == 1234) {
					switch(service) {
					case 1 : System.out.print("얼마를 입금하시겠습니까? : ");
							 input = scan.nextInt();
							 money += input;
							 break;
							 
					case 2 : if(money<=0) {
						 	 System.out.println("죄송합니다. 출금하실 수 있는 금액이 없습니다.");
						 	 break;
							 }
							
								
							 System.out.print("얼마를 출금하시겠습니까? : ");
							 output = scan.nextInt();
							 if(output > money) {
								 System.out.println("출금하려는 금액이 저금되어있는 금액보다 큽니다.");
								 //break; //출금하는 페이지로 이동할 수는 없나
							 }else {
								money -= output;
							 	break;
							 }
							 
					case 3 : System.out.println("현재 가지고 계신 금액은 : "+ money+" 원 입니다."); break;
					default : System.out.println("잘못된 숫자를 입력하였습니다.");
					}
				break; //서비스를 다 마치고 나올때					
				}
				else {
					count --;
					System.out.println("비밀번호가 틀렸습니다." + "입력횟수가 "+count+" 번 남았습니다.");
				}
			}
			if(count == 0) break;
		}
		
	
		
	}

}
