package amusementPark;
/*
 * �����Ӽ� : �̸�, Ű, ����
 * �����Ӽ� : ���̱ⱸ�� �����ϴ�.
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
		System.out.println(name+" ��(��)" + item.ridesName + "�� �����Ͽ����ϴ�.");
		item.judgeHeight(null);
	}
	
}
