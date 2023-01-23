package Arrays_programmes;

public class highestPrint {
	public static void main(String[] args) {
		int a[]= {1,2,4,5,3};
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
