class JamesTest2{
	int age;
	String name;
	boolean marriage;
	int child;
	
	public JamesTest2(int age, String name, boolean marriage, int child){
		this.age = age;
		this.name = name;
		this.marriage = marriage;
		this.child = child;
	}
	public void peopleinfo() {
		
		System.out.println("���� : "+age);
		System.out.println("�̸� : "+name);
		System.out.println("��ȥ ���� : "+marriage);
		System.out.println("�ڳ� �� : "+child);
		
	}
}
public class James2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JamesTest2 j1 = new JamesTest2(30, "James", true, 3);	
		j1.peopleinfo();
	}

}
