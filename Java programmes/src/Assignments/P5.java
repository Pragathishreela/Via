package Assignments;

public class P5 {
	public static void main(String[] args) {
		String s = "My name is Mujeeb";
		String s1[] = s.split(" ");
		String rev = "";
		for(int i=s1.length-1;i>=0;i--) {
			rev = rev + s1[i]+" ";
		}
		System.out.print(rev);
	}
}
