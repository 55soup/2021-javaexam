package TakeBus2;
/*
 * �������: �̸�, ����ī�� �ܾ�, ����
 * �������: �����ڸ޼���, ī�带 ���, ��¹�
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
	//ī�带 ���.
	public void TagCard(BusBalance item) {
		if(balance >= item.money) {
			item.addBalance(this);
		}
	}
	public void printBalance() {
		System.out.println("===== " + name + " �� ����ī�� �ܾ���" + "========");
		System.out.println(balance + " ��");
	}
	
}
