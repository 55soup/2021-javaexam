package TakeBus;
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
		System.out.println("===== " + name + " �� ����ī�� �ܾ���" + "========");
		System.out.println(balance + " ��");
	}
	
}
