/*
 * 1. ������ �𵨸� �� Ŭ���� ����
 * ������� : �̸�, �ڻ�
 * �޼���
 * ������ �޼���(�̸�, �ڻ�)
 * ���� ����(��������, �� �븦)�ϴ�
 * �������� ���� �������¸� ����ϴ�.
 */
public class Buyer {
	String name;
	int money;
	
	public Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void BuyCar(Dealer item, int amount) {
		if(item.inventory < amount) {
			item.soldCar(amount);
		}
		else if(this.money >= item.haveCarPrice * amount) {
			this.money -= item.haveCarPrice * amount;
			item.soldCar(amount);
		}else {
			System.out.println("������ �ִ� ���� �����մϴ�.");
		}
	}
	public void PrintMoney() {
		System.out.println("======" + this.name + "�� ���� �ܰ� ======");
		System.out.println("���� �ݾ�: " + this.money + "\n");
	}
}
