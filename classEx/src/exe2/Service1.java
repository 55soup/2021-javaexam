package exe2;
import java.util.Scanner;
public class Service1 {
	int input;
	Scanner scan = new Scanner(System.in);
	
	public Service1(int input) {
		super();
		this.input = input;
	}

	public void inToBalance(int balance) {
		System.out.println(input + " �� ��ŭ �ԱݵǾ����ϴ�. ");
		balance += input;
	}
}
