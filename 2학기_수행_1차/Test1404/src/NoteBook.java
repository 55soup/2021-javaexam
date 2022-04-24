class NoteBook{
	int price=2000;
	int count=100;
	
	public void totalPrice(int input) {
		price = price*input;
		count = count-input;
		System.out.println("총 판매 금액 : "+price + "원");
		System.out.println("공책의 재고량 : "+count+"개");
	}
}