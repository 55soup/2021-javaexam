
public class Selection_sort_method_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {3,2,5,9,7};
		do_selection_sort(a);
		//출력
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}//end of main
	public static int[ ] do_selection_sort(int a[]) {
		int temp;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++ ) {
				if(a[i]>a[j]) {//앞에 있는 수가 뒤에 있는 수보다 작다면
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
		
	}//end of do_selection_sort

}