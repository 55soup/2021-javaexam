/*
 * ���� ��ü�� ���� ���� �´� Ŭ������ ���弼�� 
 * ���̰� 30�� 
 * �̸��� James 
 * ��ȥ���� : true 
 * �ڳ� �� : 3
 */
class JamesTest{
	int age;
	String name;
	boolean marriage;
	int child;
	
	public void peopleinfo() {
		
		System.out.println("���� : "+age);
		System.out.println("�̸� : "+name);
		System.out.println("��ȥ ���� : "+marriage);
		System.out.println("�ڳ� �� : "+child);
		
	}
}

public class James{
	public static void main(String args[]) {
		JamesTest j1 = new JamesTest();
		
		j1.age = 30;
		j1.name = "james";
		j1.marriage = true;
		j1.child = 3;
		j1.peopleinfo();
	}
}
