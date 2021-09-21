package array_2;
//2За 3ї­
public class Array2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] c=new int[3][4];
		int k=1; 
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				c[i][j]=k++; //c[i][j]=++k;
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}

}
