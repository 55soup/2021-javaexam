/*
 * 다음 객체에 대한 설명에 맞는 클래스를 만드세요 
 * 나이가 30살 
 * 이름이 James 
 * 결혼여부 : true 
 * 자녀 수 : 3
 */
class JamesTest{
	int age;
	String name;
	boolean marriage;
	int child;
	
	public void peopleinfo() {
		
		System.out.println("나이 : "+age);
		System.out.println("이름 : "+name);
		System.out.println("결혼 여부 : "+marriage);
		System.out.println("자녀 수 : "+child);
		
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
