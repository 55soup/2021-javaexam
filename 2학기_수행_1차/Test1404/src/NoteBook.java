class NoteBook{
	int price=2000;
	int count=100;
	
	public void totalPrice(int input) {
		price = price*input;
		count = count-input;
		System.out.println("�� �Ǹ� �ݾ� : "+price + "��");
		System.out.println("��å�� ��� : "+count+"��");
	}
}