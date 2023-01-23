package Practice;

public class P1 {
	/*String Sname;
		int Sroll_number;
		P1(String name,int roll_number){
			this.Sname = name;
			this.Sroll_number = roll_number;
			System.out.println(Sname+Sroll_number);
		}*/
	public static void main(String[] args) {
		/*P1 p1 = new P1("me",1);
			P1 p2 = new P1("the",1);*/
		String a = "Iam in testyantra";
		String[] b = a.split(" ");
		String rev = "";
		String c = "";
		for(int i=0;i<b.length;i++) {
			c = b[i];
		for(int j=c.length()-1;j>=0;j--) {
			rev = rev+c.charAt(j);
		}
		}
		System.out.println(rev);
	}

}
