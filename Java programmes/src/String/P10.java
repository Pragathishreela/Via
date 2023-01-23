
package String;

public class P10 {
	public static void main(String[] args) {
		String s = "AbcdEf";
		//System.out.println(s.toUpperCase());
		String s1 = "apple mango";
		//char s2[] = s1.toCharArray();

		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a') {
				String s3 ="";
				s3 = s3 + s1.charAt(i);
				System.out.print(s3.toUpperCase());
			}
			else {
				System.out.print(s1.charAt(i));
			}
		}
	}
}
