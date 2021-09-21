package array_2;

public class ArrayExam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[][] num = new int[][]{{1},{2,3},{4,5,6},{7,8,9,10}};
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println("");
		}
		*/
		
		int[][] num = new int[4][4];
		int k=1;	
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<=i; j++) {
				num[i][j]=k++;
				System.out.print(num[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
