package TakeBus2;
/*
 * 정적요소: 이름, 교통카드 잔액, 나이
 * 동적요소: 생성자메서드, 카드를 찍다, 출력문
 */
public class Student {
	String name;
	int balance;
	int age;
	
	public Student(String name, int balance, int age) {
		super();
		this.name = name;
		this.balance = balance;
		this.age = age;
	}
	//카드를 찍다.
	public void TagCard(BusBalance item) {
		if(balance >= item.money) {
			item.addBalance(this);
		}
	}
	public void printBalance() {
		System.out.println("===== " + name + " 의 교통카드 잔액은" + "========");
		System.out.println(balance + " 원");
	}
	
}
