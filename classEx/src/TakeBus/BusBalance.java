package TakeBus;
/*
 * 정적요소 : 버스번호, 가지고 있는 잔액
 * 동적요소 : 생성자메서드, 요금이 들어온다, 출력문
 */
public class BusBalance {
	int busNum;
	int busBalance;
	
	public BusBalance(int busNum, int busBalance) {
		super();
		this.busNum = busNum;
		this.busBalance = busBalance;
	}
	
	public void printBusBalance() {
		System.out.println("======" + busNum + " 버스의 잔액은 =====");
		System.out.println(busBalance + " 원");
	}
}
