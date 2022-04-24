package medicine;
/*
 * 정적속성 : 
 * 약 이름, 약 갯수, 복용시기, (물약(1),알약(2),가루약(3) 여부)
 * +약갯수 복용시기로 하루에 얼마나 먹어야 하는지도 계산하면 좋을듯.
 * 동적속성 : 
 * 생성자메서드, 약의 현황 출력문
 */
public class Medicine {
	String medName;
	int medCount;
	int period;
	int medKinds;
	
	public Medicine(String medName, int medCount, int period, int medKinds) {
		this.medName = medName;
		this.medCount = medCount;
		this.period = period;
		this.medKinds = medKinds;
	}
	public void MedicineCorrentPrint() {
		System.out.println("===="+medName + "약 현황 ====");
		System.out.println("약 이름 : " + medName);
		System.out.println("약 갯수 : " + medCount+"정");
		System.out.println("복용시기 : " + period);
		System.out.println("약 종류 (물약 : 1, 알약 : 2, 가루약 : 3):"  + medKinds);
		System.out.println("");
	}
		
}
