package TakeBus2;
/*
 * ������� : ������ȣ, ������ �ִ� �ܾ�
 * ������� : �����ڸ޼���, ����� ���´�, ��¹�
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
		System.out.println("======" + busNum + " ������ �ܾ��� =====");
		System.out.println(busBalance + " ��");
	}
}
