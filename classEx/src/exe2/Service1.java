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
		System.out.println(input + " 원 만큼 입금되었습니다. ");
		balance += input;
	}
}
