package Assignments;

public class P1 {
	public static void main(String[] args) {
		String s = "Ramanna is my nameeeeeeeeeeeee";
		String s1[] = s.split(" ");
		String max = s1[0];
		int count = s1[0].length();
		for(int i=0;i<s1.length;i++) {
			if(s1[i].length()>count) {
				max = s1[i];
			}
		}
		System.out.println(max);
	}

}

