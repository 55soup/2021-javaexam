package medicine;

public class MenEatMedicineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Men m1 = new Men("�ڼ���", 17, "female", "����");
		Medicine med1 = new Medicine("���ڶ���", 4, 2, 2);
		med1.MedicineCorrentPrint();
		m1.eatingMedicine(med1, 1);
		m1.printrecipe();
	}

}
