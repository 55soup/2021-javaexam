
public class ScoreProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] records = new int[][] {{1301,90,80,70,0,1},
										{1302,99,76,45,0,1},
										{1303,100,56,88,0,1},
										{1304,66,100,100,0,1},
										{1305,89,98,34,0,1}};
		getSum(records);
		getRank(records);
		printRecords(records);
	}

	public static void getSum(int[][] records) {
		// TODO Auto-generated method stub
		for(int i=0; i<records.length; i++) {
			for(int j=1; j<4; j++) {
				records[i][4] += records[i][j];
			}
		}
	}

	public static void getRank(int[][] records) {
		// TODO Auto-generated method stub
		for(int i=0; i<records.length; i++) {
			for(int j=0; j<records.length; j++) {
				if(records[i][4]<records[j][4]) {
					++records[i][5];
				}
			}
		}
	}

	
	public static void printRecords(int[][] records) {
		// TODO Auto-generated method stub
		System.out.println("***********성적처리결과***********");
		System.out.println("학번\t국어\t영어\t수학\t합계\t등수");
		for(int i=0; i<records.length; i++) {
			for(int j=0; j<records[i].length; j++) {
				System.out.print(records[i][j] + "\t");
			}
			System.out.println("");
	}

	}
}
