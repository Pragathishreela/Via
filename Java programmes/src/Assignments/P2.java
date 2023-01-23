package Assignments;

public class P2 {
	public static void main(String[] args) {
		String s = "the name is yash";
		String s1[]= s.split(" ");
		String s2 = "";
		for(int i=0;i<s1.length;i++) {
			if(s1[i].startsWith("y")) {
			s1[i] = s1[i].toUpperCase();
			s2 = s2 + s1[i]+" ";
			}
			else {
				s2 = s2 + s1[i]+" ";
			}
		}
		System.out.println(s2);
	}
}
