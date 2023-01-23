package Encapsulation;

public class P2 {
	public static void main(String[] args) {
		P1 a1 = new P1(1,"Pragathi",100);
		P1 a2 = new P1(2,"Charan",200);
		P1 a3 = new P1(3,"Meghana",300);
		a1.setNameidMarks(1,"charan", 0);
		/*System.out.println(a.getId());
		System.out.println(a.getMarks());
		System.out.println(a.getName());
		a.setId(1);
		a.setName("Pragathi");
		a.setMarks(100);
		System.out.println(a.getId());
		System.out.println(a.getMarks());
		System.out.println(a.getName());*/
		System.out.println(a1.getId()+" "+a1.getName()+" "+a1.getMarks());
		System.out.println(a2.getMarks()+" "+a1.getId()+" "+a2.getName());
		System.out.println();
		
		
	}
}
