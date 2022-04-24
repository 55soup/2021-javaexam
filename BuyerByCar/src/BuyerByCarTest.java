
public class BuyerByCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b1 = new Buyer("나미림", 4000000);
		Buyer b2 = new Buyer("박선주", 100000000);
		Dealer d1 = new Dealer("박미림",5 , 2000000);
		Dealer d2 = new Dealer("김민영", 1, 7000000);
		//재고량, 가격에 맞게 잘 샀을 때
		b1.PrintMoney();
		b1.BuyCar(d1, 1);
		b1.PrintMoney();
		d1.printSales();
		//재고량 보다 더 많이 샀을 때
		b2.PrintMoney();
		b2.BuyCar(d1, 6);
		b2.PrintMoney();
		d2.printSales();
		//차 가격보다 적은 자금을 가지고 있을 때
		b1.PrintMoney();
		b1.BuyCar(d2, 5);
		b1.PrintMoney();
		d1.printSales();
				
	}

}
