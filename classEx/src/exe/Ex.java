package exe;
// �Ű������� �����ΰ� �����ڸ޼��忡 �Ű������� �����ΰ�!

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exe e1 = new exe(14);
		e1.agePrint(15);
	}

}

class exe{
	int age;
	
	public exe(int age) {
		this.age = age;
	}
	public void agePrint(int age) {
		System.out.println("���̴� " + age + "��"); //this.age �ϰ�� ������ �޼��� �Ű������� ��
	}
}
