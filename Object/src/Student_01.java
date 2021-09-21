//학생이 편의점에서 물건을 사다.
public class Student_01 {
	String school; //학교
	String hakbun; //학번
	String name; //이름
	int money; //가지고 있는 돈
	String item; //학생이 사고 싶은 물건
	//키가 큰지 눈이 예쁜지에 관한 속성은 필요없음.(모델링)
	
	public void buyItem(String item, int price) {//물건을 사는 행위
		money -= price;	
		
	}
}
