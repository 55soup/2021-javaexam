/*
 * 2. �ڵ��� ���� �𵨸� �� Ŭ���� ����
 * ������� : �����̸�, ���, �� ����
 * �޼���
 * ������ �޼���(�����̸�, ���, �� ����)
 * �ڵ����� �Ǹ�(����) �ϴ�
 * �ڵ����� �ǸŻ���(���, �����)�� ����Ѵ�.
 */
public class Dealer {
	String dealerName;
	int inventory;
	int haveCarPrice;
	int sales=0;
	//������ �޼���
	public Dealer(String dealerName, int inventory, int haveCarPrice) {
		this.dealerName = dealerName;
		this.haveCarPrice = haveCarPrice;
		this.inventory = inventory;
	}
	public void soldCar(int amount) {
		if(this.inventory >= amount) {
			this.inventory -= amount;
			this.sales += haveCarPrice * amount;
		}else {
			System.out.println("����� �����Ͽ� �ǸŰ� ��ƽ��ϴ�.");
		}
	}
	public void printSales() {
		System.out.println("======== ���� "+this.dealerName+"�� �Ǹ� ��Ȳ ========");
		System.out.println("���: " + this.inventory);
		System.out.println("�����: " + this.sales + "\n");
	}
}

