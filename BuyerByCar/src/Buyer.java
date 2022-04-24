/*
 * 1. 구매자 모델링 및 클래스 구현
 * 정적요소 : 이름, 자산
 * 메서드
 * 생성자 메서드(이름, 자산)
 * 차를 구입(누구에게, 몇 대를)하다
 * 구매자의 차량 보유상태를 출력하다.
 */
public class Buyer {
	String name;
	int money;
	
	public Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void BuyCar(Dealer item, int amount) {
		if(item.inventory < amount) {
			item.soldCar(amount);
		}
		else if(this.money >= item.haveCarPrice * amount) {
			this.money -= item.haveCarPrice * amount;
			item.soldCar(amount);
		}else {
			System.out.println("가지고 있는 돈이 부족합니다.");
		}
	}
	public void PrintMoney() {
		System.out.println("======" + this.name + "의 현재 잔고 ======");
		System.out.println("남은 금액: " + this.money + "\n");
	}
}
