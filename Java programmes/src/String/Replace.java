package String;

public class Replace {
	public static void main(String[] args) {
		String s = "hi bye cya hi bye cya hi bye";
		String s1[] = s.split(" ");
		String s2 = "";
		for(int i = 0;i<s1.length;i++) {
			if(s1[i].equals("hi")) {
				s1[i]="bye";
				s2 = s2 + s1[i]+" ";
			}
			else {
				s2 = s2 + s1[i]+" ";
			}
			
		}
		System.out.print(s2);
	}
}
