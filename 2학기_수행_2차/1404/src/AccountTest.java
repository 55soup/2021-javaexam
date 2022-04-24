import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		Account a1 = new Account(123,100000);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("======메뉴선택======");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 예금");
			System.out.println("4. 잔액 조회");
			System.out.println("5. 종료");
			System.out.println("==================");
			System.out.print("메뉴입력: ");
			menu = scan.nextInt();
			
			if(menu == 5) break;
			switch(menu) {
			case 1: a1.deposit(); break;
			case 2: a1.withdraw(); break;
			case 3: a1.getInterest(); break;
			case 4: a1.printBalance(); break;
			}
			
		}
	}

}
