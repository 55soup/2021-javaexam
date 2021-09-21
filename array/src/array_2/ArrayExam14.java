package array_2;

public class ArrayExam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[][] a = new char[5][5];
		int k=66; 
		
		for(int i=a.length-1; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				a[i][j]=(char)++k;
				System.out.print(a[i][j]+"\t");
			}
			k=k-i;
			System.out.println("");
		}
	}

}
