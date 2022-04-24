import java.util.Scanner;
public class Account {
	private int num; //계좌번호
	private double balance; //잔액
	static private final double add = 0.05; //금리
	Scanner scan = new Scanner(System.in);
	int input; //입금액
	int output; //출금액
	int addLong; //예금기간
	double addMoney; //이자금액
	double expertMoney; //예상잔액
	
	//생성자 메서드
	public Account(int num, int balance) {
		super();
		this.num = num;
		this.balance = balance;
	}
	
	public void deposit() {//입금
		System.out.print("예금할 금액 입력: ");
		input = scan.nextInt();
		balance += input;
		System.out.println("잔액 : " + balance);
	}
	public void withdraw() {//출금
		System.out.print("출금할 금액 입력: ");
		output = scan.nextInt();
		if(balance >= output) {
			balance -= output;
			System.out.println("잔액 : " + balance);
		}else {
			System.out.println("예금액 부족으로 출금이 불가능합니다.");
		}
	}
	public void printBalance() {//현재상태
		System.out.println("=======================");
		System.out.println("계좌번호 : " + num);
		System.out.println("잔액 : " + balance);
		System.out.println("=======================");
	}
	public void getInterest() {//예금 기간
		System.out.print("예금 기간 입력: ");
		addLong = scan.nextInt();
		addMoney = balance * add * addLong;
		expertMoney = balance + addMoney;
		balance += addMoney;
		System.out.println("이자금액 : " + addMoney);
		System.out.println("예상잔액 : " + expertMoney);
	}
}
