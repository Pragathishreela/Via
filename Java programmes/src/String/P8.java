package String;

public class P8 {
	public static void main(String[] args) {
		String s = "PragatHI hi hello";
		/*char s1[] = s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}*/
		
		System.out.println(s.replace("hi","bye"));
		System.out.println(s.replace("PragatHI hi hello", "Meghana hello"));
		System.out.println(s.replaceAll("[a-z]", ""));
	}
}
