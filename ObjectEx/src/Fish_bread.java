/*
 * �ؾ�� ��� ���. �޼��� ->�ؾ 
 */

class buyer{
	int money;
	int changeMon;
	
	public void buy_fishBread(String taste, int price, int count) {
		if(money >= price * count) {
			changeMon = money - (price * count);
			System.out.println(money + "�� ����"
					+ " "+ (price * count) + "�� ��ŭ �����߽��ϴ�. ");
			System.out.println("���� �� : " + changeMon+"��");
			System.out.println(taste + "�� �ؾ�� " + count + "�� ����ϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
}
public class Fish_bread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buyer sunjoo = new buyer();
		sunjoo.money = 5000;
		sunjoo.buy_fishBread("��ġ", 500, 3);
	}

}
