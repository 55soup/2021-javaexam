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
			System.out.println("������ ������ �� �����ϴ�");
		}
		
	}
	public void printMoney() {
		System.out.println("==============���� �� ==============");;
		System.out.println(name + "�� ���� �ݾ���: " + this.money);
	}
}

