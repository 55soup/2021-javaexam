package TakeBus2;
/*
 * 정적요소 : 버스번호, 가지고 있는 잔액
 * 동적요소 : 생성자메서드, 요금이 들어온다, 출력문
 */
public class BusBalance {
	int busNum;
	int busBalance;
	int money;
	
	public BusBalance(int busNum, int busBalance) {
		super();
		this.busNum = busNum;
		this.busBalance = busBalance;
	}
	public void addBalance(Student item) {
		if(item.age < 13) {
			item.balance -= 800;
			busBalance += 800;
		}else if(item.age < 20) {
			item.balance-= 1100;
			busBalance += 1100;
		}else {
			item.balance-=1500;
			busBalance += 1500;
		}
	}
	public void printBusBalance() {
		System.out.println("======" + busNum + " 버스의 잔액은 =====");
		System.out.println(busBalance + " 원");
	}
}
