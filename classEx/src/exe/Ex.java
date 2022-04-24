package exe;
// 매개변수가 먼저인가 생성자메서드에 매개변수가 먼저인가!

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
		System.out.println("나이는 " + age + "살"); //this.age 일경우 생성자 메서드 매개변수가 들어감
	}
}
