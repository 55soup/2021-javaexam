import java.util.Scanner;
public class Account {
	private int num; //���¹�ȣ
	private double balance; //�ܾ�
	static private final double add = 0.05; //�ݸ�
	Scanner scan = new Scanner(System.in);
	int input; //�Աݾ�
	int output; //��ݾ�
	int addLong; //���ݱⰣ
	double addMoney; //���ڱݾ�
	double expertMoney; //�����ܾ�
	
	//������ �޼���
	public Account(int num, int balance) {
		super();
		this.num = num;
		this.balance = balance;
	}
	
	public void deposit() {//�Ա�
		System.out.print("������ �ݾ� �Է�: ");
		input = scan.nextInt();
		balance += input;
		System.out.println("�ܾ� : " + balance);
	}
	public void withdraw() {//���
		System.out.print("����� �ݾ� �Է�: ");
		output = scan.nextInt();
		if(balance >= output) {
			balance -= output;
			System.out.println("�ܾ� : " + balance);
		}else {
			System.out.println("���ݾ� �������� ����� �Ұ����մϴ�.");
		}
	}
	public void printBalance() {//�������
		System.out.println("=======================");
		System.out.println("���¹�ȣ : " + num);
		System.out.println("�ܾ� : " + balance);
		System.out.println("=======================");
	}
	public void getInterest() {//���� �Ⱓ
		System.out.print("���� �Ⱓ �Է�: ");
		addLong = scan.nextInt();
		addMoney = balance * add * addLong;
		expertMoney = balance + addMoney;
		balance += addMoney;
		System.out.println("���ڱݾ� : " + addMoney);
		System.out.println("�����ܾ� : " + expertMoney);
	}
}
