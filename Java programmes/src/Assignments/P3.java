package Assignments;

public class P3 {
	public static void main(String[] args) {
		String s = "I LOVE JAVA CODING";
		char a = 'A';
		for(int i=1;i<=26;i++) {
			int count = 0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==a) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(a + "-"+count);
			}
			a++;
		}
	}
}
