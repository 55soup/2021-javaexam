
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				sum -= i; //Â¦¼ö
			}else {
				sum += i; //È¦¼ö
			}
		}
		System.out.println(sum);
	}

}
