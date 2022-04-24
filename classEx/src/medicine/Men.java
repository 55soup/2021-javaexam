package medicine;
/*
 * 정적속성 : 
 * 이름, 나이, 성별, 병명.
 * 동적속성 : 
 * 생성자메서드, 약을 먹는다, 출력문
 */
//문제 낼때는 약 종류 빼기. 약갯수새기가 어려움.
public class Men {
	private String name;
	private int age;
	private String gender;
	private String sickness;
	
	public Men(String name, int age, String gender, String sickness) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sickness = sickness;
	}
	public void eatingMedicine(Medicine item, int amount) {
		if(item.medKinds == 1) {
			--item.medCount;
			System.out.println(item.medName + "를(을) " + amount + " 개 복용했습니다.");
			item.MedicineCorrentPrint();
		}else if(item.medKinds == 2) {
			--item.medCount;
			System.out.println(item.medName + "를(을) " + amount + " 개 복용했습니다.");
			System.out.println("알약은 물과 함께 드세요.");
			item.MedicineCorrentPrint();
		}else {
			--item.medCount;
			System.out.println(item.medName + "를(을)" + amount + " 개 복용했습니다.");
			item.MedicineCorrentPrint();
		}
	}
	public void printrecipe(){
		System.out.println("======" + name + " 님의 정보 ======" );
		System.out.println("이름 : " + name);
		System.out.println("나이  :" + age);
		System.out.println("성별 " + gender);
		System.out.println("병명 : " + sickness);
		System.out.println("");
	}
}
