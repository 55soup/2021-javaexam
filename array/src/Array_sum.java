
public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[100]; 
		int sum = 0;
		
		for(int i=0; i<num.length; i++) { //num.length 안되는 이유=> 원소의 갯수(100)까지만 반복. 즉 쓰려면 이상이 아니라 미만을 사용해야.
			if((i+1) % 2 == 0) {
				num[i] = (i+1)*(-1);
			}else{
				num[i] = i+1;
			}	
			sum += num[i]; //더하는 식 하나만
		}
			
		System.out.println("1-2+3-4+5-6... = " + sum);
		
	}

}
