package amusementPark;
/*
 * 정적속성 : 이름, 키, 나이
 * 동적속성 : 놀이기구에 입장하다.
 */
public class Visitor {
	private String name;
	double height;
	int age;
	
	// using Constructor using Field
	public Visitor(String name, double height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
	}
	public void inToPark(Staff item) {
		System.out.println(name+" 이(가)" + item.ridesName + "에 입장하였습니다.");
		item.judgeHeight(null);
	}
	
}
