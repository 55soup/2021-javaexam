package medicine;
/*
 * �����Ӽ� : 
 * �� �̸�, �� ����, ����ñ�, (����(1),�˾�(2),�����(3) ����)
 * +�హ�� ����ñ�� �Ϸ翡 �󸶳� �Ծ�� �ϴ����� ����ϸ� ������.
 * �����Ӽ� : 
 * �����ڸ޼���, ���� ��Ȳ ��¹�
 */
public class Medicine {
	String medName;
	int medCount;
	int period;
	int medKinds;
	
	public Medicine(String medName, int medCount, int period, int medKinds) {
		this.medName = medName;
		this.medCount = medCount;
		this.period = period;
		this.medKinds = medKinds;
	}
	public void MedicineCorrentPrint() {
		System.out.println("===="+medName + "�� ��Ȳ ====");
		System.out.println("�� �̸� : " + medName);
		System.out.println("�� ���� : " + medCount+"��");
		System.out.println("����ñ� : " + period);
		System.out.println("�� ���� (���� : 1, �˾� : 2, ����� : 3):"  + medKinds);
		System.out.println("");
	}
		
}
