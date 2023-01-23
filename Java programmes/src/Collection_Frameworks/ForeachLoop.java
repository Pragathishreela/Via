package Collection_Frameworks;
import java.util.ArrayList;
import java.util.Scanner;
public class ForeachLoop {
	public static void main(String[] args) {
		/*ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		Integer sum = 0;
		for(Integer i : a1) {
			sum = sum + i;
		}
		System.out.println(sum);*/
		int sum = 0;
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		for(Object i : a1) {
			int a = (int)i;//non primitive typecasting
			/*Integer a = (Integer)i;
			int b = a;
			sum = sum + b;*/
			sum = sum + a;
		}
		System.out.println(sum);
	}
}
