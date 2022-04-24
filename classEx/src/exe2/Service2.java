package exe2;

public class Service2 {
	int output;
	
	public Service2(int output) {
		super();
		this.output = output;
	}

	public void outToBalance(int balance) {
		if(balance >= output) {
			balance -= output;
		}else {
			System.out.println("출금이 불가능합니다.");
		}
	}
}
