package banking;
/* ����
 * �Ӽ� : ���¹�ȣ, ������, �ܾ�
 * �޼��� : �����ڸ޼���(���¹�ȣ, ������, �ܾ�)
 * 		�Ա�(�ܾ�+=�Աݾ�), ���, ���(�ܾ�-=��ݾ�, �ܾ�>= ��ݾ�), �ܾ� ���
 */
public class Account {
	private int num;
	private String name;
	private int balance;
	
	public Account(int num, String name, int balance) {
		super();
		this.num = num;
		this.name = name;
		this.balance = balance;
	}
	public void accountInput(int input) {
		balance += input;
	}
	public void accountOutput(int output) {
		if(balance >= output) {
			balance -= output;
		}
	}
	public void printBalance() {
		System.out.println("===== " + name + "���� ���¹�ȣ : " + num + " �� �ܾ� =====");
		System.out.println(balance + " ��");
	}
}
