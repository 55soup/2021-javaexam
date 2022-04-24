/*
 * 자동차를 모델링하여 클래스를 정의해보자.
 * 이름, 색상, 제조사 속성을 갖고, 정지, 주행이라는 메서드를 갖는다.
 */

class CarSample{
	String name;
	String color;
	String company;
	int speed; //필요하다면 추가로 선언可 
	
	public void stop() {//메서드는 사용자의 요구사항을 반영하여 작성해야함. 임의x
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
		CarSample avante = new CarSample(); //인스턴스 객체를 생성하는 문법사항.
		avante.color = "white";
		avante.company = "hyundai";
		
		for(int i=1; i<=3; i++) { //연속해서 3번 주행
			avante.run(); //speed = 30
		}
		System.out.println(avante.speed);
		
		CarSample tivoli = new CarSample();
		tivoli.color = "blue";
		
		for(int i=1; i<=25; i++) {
			tivoli.run();
		}
		System.out.println(tivoli.color + "색의 차 속도 " + tivoli.speed);
	}

}