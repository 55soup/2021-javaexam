/*
 * �ڵ����� �𵨸��Ͽ� Ŭ������ �����غ���.
 * �̸�, ����, ������ �Ӽ��� ����, ����, �����̶�� �޼��带 ���´�.
 */

class CarSample{
	String name;
	String color;
	String company;
	int speed; //�ʿ��ϴٸ� �߰��� ����ʦ 
	
	public void stop() {//�޼���� ������� �䱸������ �ݿ��Ͽ� �ۼ��ؾ���. ����x
		speed = 0;
	}
	public void run() {
		if(speed >= 200) {
			speed -= 10;
		}else {
			speed += 10;
		}
	}
}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarSample avante = new CarSample(); //�ν��Ͻ� ��ü�� �����ϴ� ��������.
		avante.color = "white";
		avante.company = "hyundai";
		
		for(int i=1; i<=3; i++) { //�����ؼ� 3�� ����
			avante.run(); //speed = 30
		}
		System.out.println(avante.speed);
		
		CarSample tivoli = new CarSample();
		tivoli.color = "blue";
		
		for(int i=1; i<=25; i++) {
			tivoli.run();
		}
		System.out.println(tivoli.color + "���� �� �ӵ� " + tivoli.speed);
	}

}