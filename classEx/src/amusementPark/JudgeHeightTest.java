package amusementPark;

public class JudgeHeightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor v1 = new Visitor("박선주", 170, 17); //입장o
		Visitor v2 = new Visitor("김땡땡", 145, 18); //입장x (키)
		Visitor v3 = new Visitor("나나나", 180, 12); //입장x (나이)
		
		Staff s1 = new Staff("혜성특급");

	}

}
