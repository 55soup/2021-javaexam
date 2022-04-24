package TakeBus;
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
		if(balance >= 800) {
			if(age < 13) {
				balance -= 800;
				item.busBalance += 800;
			}else if(age < 20) {
				balance-= 1100;
				item.busBalance += 1100;
			}else {
				balance-=1500;
				item.busBalance += 1500;
			}
		}
	}
	public void printBalance() {
		System.out.println("===== " + name + " 의 교통카드 잔액은" + "========");
		System.out.println(balance + " 원");
	}
	
}
