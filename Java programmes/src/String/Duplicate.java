package String;

public class Duplicate {
	public static void main(String[] args) {
		int a[] = {2,1,3,1,2};
		int b[] = new int[10];
		for(int i=1;i<a.length;i++) {
			for(int j=1;j<b.length;j++) {
				if(a[i]!=b[j]) {
					b[i]=b[j];
				}
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
