package TakeBus;
/*
 * ������� : ������ȣ, ������ �ִ� �ܾ�
 * ������� : �����ڸ޼���, ����� ���´�, ��¹�
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
		System.out.println("======" + busNum + " ������ �ܾ��� =====");
		System.out.println(busBalance + " ��");
	}
}
