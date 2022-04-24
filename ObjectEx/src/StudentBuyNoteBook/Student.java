package StudentBuyNoteBook;
class StudentTest{
	String name;
	int money;
	
	public StudentTest(String name, int money){
		this.name=name;
		this.money=money;
	}
	public void studentBuyNotebook(NoteBook item, int amount) {
		if(this.money >= item.price * amount) {
			this.money -= item.price * amount;
		}else {
			System.out.println("물건을 구입할 수 없습니다");
		}
		
	}
	public void printMoney() {
		System.out.println("==============남은 돈 ==============");;
		System.out.println(name + "의 남은 금액은: " + this.money);
	}
}

