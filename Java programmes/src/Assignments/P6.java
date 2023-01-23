package Assignments;

public class P6 {
	public static void main(String[] args) {
		String s = "HI HELLO UNCLE HOW ARE YOU DOING";
		String s1[] = s.split(" ");
		String s2 = "";
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals("UNCLE")||s1[i].equals("YOU")) {
				for(int j=s1[i].length()-1;j>=0;j--) {
					s2 = s1[i];
					System.out.print(s2.charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(s1[i]+" ");
			}
		}
	}
}
