package Arrays_programmes;

public class sortAnArray {
	public static void main(String[] args) {
		int a[] = {1,2,5,4,8,6,3};
		//int b[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
}
