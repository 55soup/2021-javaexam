class NoteBook{
	int price;
	int count;
	
	public void totalPrice(int count) {
		price = 2000*count; //notebook의 가격이 2000원
		count = 100-count; //총 재고량이 100개
		System.out.println("총 판매 금액 : "+price+"원");
		System.out.println("공책의 재고량 : "+count+"개");
	}
}