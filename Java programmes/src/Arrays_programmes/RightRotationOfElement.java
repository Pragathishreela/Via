package Arrays_programmes;

public class RightRotationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		for(int i=a.length-1;i>0;i--) {
			int temp=a[i];
			a[i]=a[i-1];
			a[i-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
