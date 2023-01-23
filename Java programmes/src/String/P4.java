package String;

public class P4 {
	public static void main(String[] args) {
		String s = "Class Mate";
		int count = 0;
		//char b[]= {'a','e','i','o','u'};
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(count);
	}
}
