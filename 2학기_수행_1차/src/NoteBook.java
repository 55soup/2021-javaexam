class NoteBook{
	int price;
	int count;
	
	public void totalPrice(int count) {
		price = 2000*count; //notebook�� ������ 2000��
		count = 100-count; //�� ����� 100��
		System.out.println("�� �Ǹ� �ݾ� : "+price+"��");
		System.out.println("��å�� ��� : "+count+"��");
	}
}