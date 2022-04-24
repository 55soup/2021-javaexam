package banking;
/* 계좌
 * 속성 : 계좌번호, 예금주, 잔액
 * 메서드 : 생성자메서드(계좌번호, 예금주, 잔액)
 * 		입금(잔액+=입금액), 출금, 출금(잔액-=출금액, 잔액>= 출금액), 잔액 출력
 */
public class Account {
	private int num;
	private String name;
	private int balance;
	
	public Account(int num, String name, int balance) {
		super();
		this.num = num;
		this.name = name;
		this.balance = balance;
	}
	public void accountInput(int input) {
		balance += input;
	}
	public void accountOutput(int output) {
		if(balance >= output) {
			balance -= output;
		}
	}
	public void printBalance() {
		System.out.println("===== " + name + "님의 계좌번호 : " + num + " 의 잔액 =====");
		System.out.println(balance + " 원");
	}
}
