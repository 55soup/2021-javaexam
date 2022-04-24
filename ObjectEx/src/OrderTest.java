/*
 * 주문번호 : YYYYMMDD0000
 * 주문자아이디 : ______
 * 주문날짜 : YY-MM-DD
 * 주문자이름 : ***
 * 주문상품번호 : 
 * 배송주소 : 
 */
class Order{
	long orderNum;
	String id;
	String date;
	String orderName;
	String num;
	String add;
	
	public void orderInfo() {
		System.out.println("주문번호 : "+orderNum);
		System.out.println("주문자아이디 : " + id);
		System.out.println("주문날짜 : "+date);
		System.out.println("주문자이름 : "+orderName);
		System.out.println("주문상품번호 : "+num);
		System.out.println("배송주소 : " +add);
	}
}
public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1 = new Order();
		o1.orderNum = 202110259876L;
		o1.id = "yuyung";
		o1.date = "21-10-25";
		o1.orderName = "최윤영";
		o1.num = "9876";
		o1.add = "경기도 안산시 와동공원로 사안길 35";
		o1.orderInfo();
	}

}
