package banking;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(12341234, "�ڼ���", 100000);
		a1.accountInput(20000);
		a1.accountOutput(120000);
		a1.printBalance();
	}

}
