
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {3,5};
		int temp;
		
		//before
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		temp = a[0]; //¿Ü¿ö,...
		a[0] = a[1];
		a[1] = temp;
		
		//after
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
