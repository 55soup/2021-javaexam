/*
 * �ֹ���ȣ : YYYYMMDD0000
 * �ֹ��ھ��̵� : ______
 * �ֹ���¥ : YY-MM-DD
 * �ֹ����̸� : ***
 * �ֹ���ǰ��ȣ : 
 * ����ּ� : 
 */
class Order{
	long orderNum;
	String id;
	String date;
	String orderName;
	String num;
	String add;
	
	public void orderInfo() {
		System.out.println("�ֹ���ȣ : "+orderNum);
		System.out.println("�ֹ��ھ��̵� : " + id);
		System.out.println("�ֹ���¥ : "+date);
		System.out.println("�ֹ����̸� : "+orderName);
		System.out.println("�ֹ���ǰ��ȣ : "+num);
		System.out.println("����ּ� : " +add);
	}
}
public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1 = new Order();
		o1.orderNum = 202110259876L;
		o1.id = "yuyung";
		o1.date = "21-10-25";
		o1.orderName = "������";
		o1.num = "9876";
		o1.add = "��⵵ �Ȼ�� �͵������� ��ȱ� 35";
		o1.orderInfo();
	}

}
