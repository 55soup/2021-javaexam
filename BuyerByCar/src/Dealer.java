/*
 * 2. 자동차 딜러 모델링 및 클래스 구현
 * 정적요소 : 딜러이름, 재고량, 차 가격
 * 메서드
 * 생성자 메서드(딜러이름, 재고량, 차 가격)
 * 자동차를 판매(개수) 하다
 * 자동차의 판매상태(재고량, 매출액)를 출력한다.
 */
public class Dealer {
	String dealerName;
	int inventory;
	int haveCarPrice;
	int sales=0;
	//생성자 메서드
	public Dealer(String dealerName, int inventory, int haveCarPrice) {
		this.dealerName = dealerName;
		this.haveCarPrice = haveCarPrice;
		this.inventory = inventory;
	}
	public void soldCar(int amount) {
		if(this.inventory >= amount) {
			this.inventory -= amount;
			this.sales += haveCarPrice * amount;
		}else {
			System.out.println("재고량이 부족하여 판매가 어렵습니다.");
		}
	}
	public void printSales() {
		System.out.println("======== 딜러 "+this.dealerName+"의 판매 현황 ========");
		System.out.println("재고량: " + this.inventory);
		System.out.println("매출액: " + this.sales + "\n");
	}
}

