package Methods;
public class P1 {
	int roll ;
	String name;
	P1(int roll,String name){
		this.name=name;
		this.roll=roll;
	}
	public String toString() {				//overriding tostring method which is present in object class
		return this.name+" "+this.roll;
	}
	public static void main(String[] args) {
		P1 a1 = new P1(01,"pragathi");
		System.out.println(a1);
	}
}
