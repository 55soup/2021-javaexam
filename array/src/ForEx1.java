/*2+4+6+8+10...100 =?*/

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[50];
		int sum=0;
		
		for(int i=0; i<num.length; i++) {                   
				num[i] = (i+1)*2;
				sum += num[i];
		}
		System.out.println("2+4+6+8+10...100= "+sum);
	}

}
