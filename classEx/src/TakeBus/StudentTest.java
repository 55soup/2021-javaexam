package TakeBus;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("¹Ú¼±ÁÖ", 6000, 17);
		BusBalance b1 = new BusBalance(3412, 0);
		
		s1.printBalance();
		s1.TagCard(b1);
		b1.printBusBalance();
		s1.printBalance();
	}

}
