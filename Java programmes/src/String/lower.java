package String;

public class lower {
	public static void main(String[] args) {
		String s = "I LIVE IN BANGLORE KARNATAKA";
	//	String s1 = "Its Meghana";
		//String s2 = " a";
		/*System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("APPLE"));
		System.out.println(s.endsWith("NGO"));
		System.out.println(s.startsWith("L",3));*/
		/*System.out.println(s.contains("A"));//word or letter
		System.out.println(s.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s2.codePointAt(1));
		System.out.println(s.indexOf('A',0));
		System.out.println(s.codePointBefore(1));*/
		String s3[] = s.split(" ");
		String rev = "";
		String s4 = "";
		/*int i=0;
		int count = 0;
		while(i<s3.length) {
			System.out.println(s3[i]);
			count++;
			i++;
		}
		System.out.println(count);*/
		//System.out.println(s3.length);
		/*for(int i=s3.length-1;i>=0;i--) {
			rev = rev +s3[i];
		}
		System.out.println(rev);*/
		//System.out.println(s3[3]);
		for(int i=0;i<s3.length;i++) {
			if(s3[i].equals("BANGLORE")) {
				
				for(int j=s3[i].length();j>=0;j--) {
					s4 = s3[i];
					System.out.print(s4.charAt(j));
				}
				System.out.print(" ");
			}
				else {
					System.out.print((s3[i])+" ");
				}
			
			}
		}
		
		
	}

