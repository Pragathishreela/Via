package Practice;

public class A {
	int num=10;
	int cl=23;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1=new A();
		A a2=new A();
		a1.add();
		System.out.println(a1.num);

	}
	public void add() {
		this.num=0;
	}

}
