
public class BuyerByCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b1 = new Buyer("���̸�", 4000000);
		Buyer b2 = new Buyer("�ڼ���", 100000000);
		Dealer d1 = new Dealer("�ڹ̸�",5 , 2000000);
		Dealer d2 = new Dealer("��ο�", 1, 7000000);
		//���, ���ݿ� �°� �� ���� ��
		b1.PrintMoney();
		b1.BuyCar(d1, 1);
		b1.PrintMoney();
		d1.printSales();
		//��� ���� �� ���� ���� ��
		b2.PrintMoney();
		b2.BuyCar(d1, 6);
		b2.PrintMoney();
		d2.printSales();
		//�� ���ݺ��� ���� �ڱ��� ������ ���� ��
		b1.PrintMoney();
		b1.BuyCar(d2, 5);
		b1.PrintMoney();
		d1.printSales();
				
	}

}
