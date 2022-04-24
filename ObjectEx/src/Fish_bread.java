/*
 * ºØ¾î»§À» »ç´Â »ç¶÷. ¸Þ¼­µå ->ºØ¾î»§ 
 */

class buyer{
	int money;
	int changeMon;
	
	public void buy_fishBread(String taste, int price, int count) {
		if(money >= price * count) {
			changeMon = money - (price * count);
			System.out.println(money + "¿ø ¿¡¼­"
					+ " "+ (price * count) + "¿ø ¸¸Å­ Â÷°¨Çß½À´Ï´Ù. ");
			System.out.println("³²Àº µ· : " + changeMon+"¿ø");
			System.out.println(taste + "¸À ºØ¾î»§À» " + count + "°³ »ò½À´Ï´Ù.");
		}else {
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
		}
	}
}
public class Fish_bread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buyer sunjoo = new buyer();
		sunjoo.money = 5000;
		sunjoo.buy_fishBread("±èÄ¡", 500, 3);
	}

}
