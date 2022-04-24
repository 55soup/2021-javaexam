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
		
		System.out.println("나이 : "+age);
		System.out.println("이름 : "+name);
		System.out.println("결혼 여부 : "+marriage);
		System.out.println("자녀 수 : "+child);
		
	}
}
public class James2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JamesTest2 j1 = new JamesTest2(30, "James", true, 3);	
		j1.peopleinfo();
	}

}
