package amusementPark;
/*
 * �����Ӽ� : ���̱ⱸ �̸�
 * �����Ӽ� : Ű�� ���
 */
public class Staff {
	String ridesName;
	
	public Staff(String name) {
		super();
		this.ridesName = name;
	}
	public void judgeHeight(Visitor item) {
		if(item.age >=13 || item.height >=150 || item.height <=190) {
			System.out.println("������ �����մϴ�. ");
		}else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
	
}
