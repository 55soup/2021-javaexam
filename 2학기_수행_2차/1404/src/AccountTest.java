import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		Account a1 = new Account(123,100000);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("======�޴�����======");
			System.out.println("1. �Ա�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �ܾ� ��ȸ");
			System.out.println("5. ����");
			System.out.println("==================");
			System.out.print("�޴��Է�: ");
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
