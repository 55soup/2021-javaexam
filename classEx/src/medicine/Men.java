package medicine;
/*
 * �����Ӽ� : 
 * �̸�, ����, ����, ����.
 * �����Ӽ� : 
 * �����ڸ޼���, ���� �Դ´�, ��¹�
 */
//���� ������ �� ���� ����. �హ�����Ⱑ �����.
public class Men {
	private String name;
	private int age;
	private String gender;
	private String sickness;
	
	public Men(String name, int age, String gender, String sickness) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sickness = sickness;
	}
	public void eatingMedicine(Medicine item, int amount) {
		if(item.medKinds == 1) {
			--item.medCount;
			System.out.println(item.medName + "��(��) " + amount + " �� �����߽��ϴ�.");
			item.MedicineCorrentPrint();
		}else if(item.medKinds == 2) {
			--item.medCount;
			System.out.println(item.medName + "��(��) " + amount + " �� �����߽��ϴ�.");
			System.out.println("�˾��� ���� �Բ� �弼��.");
			item.MedicineCorrentPrint();
		}else {
			--item.medCount;
			System.out.println(item.medName + "��(��)" + amount + " �� �����߽��ϴ�.");
			item.MedicineCorrentPrint();
		}
	}
	public void printrecipe(){
		System.out.println("======" + name + " ���� ���� ======" );
		System.out.println("�̸� : " + name);
		System.out.println("����  :" + age);
		System.out.println("���� " + gender);
		System.out.println("���� : " + sickness);
		System.out.println("");
	}
}
