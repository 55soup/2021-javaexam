package amusementPark;
/*
 * 정적속성 : 놀이기구 이름
 * 동적속성 : 키를 재다
 */
public class Staff {
	String ridesName;
	
	public Staff(String name) {
		super();
		this.ridesName = name;
	}
	public void judgeHeight(Visitor item) {
		if(item.age >=13 || item.height >=150 || item.height <=190) {
			System.out.println("입장이 가능합니다. ");
		}else {
			System.out.println("입장이 불가능합니다.");
		}
	}
	
}
