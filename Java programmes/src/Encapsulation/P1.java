package Encapsulation;

public class P1 {
	private int id;
	private String name;
	private double marks;
	P1(int id,String name,double marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void setNameidMarks(int id,String name,double marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
		System.out.println();
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getMarks() {
		return this.marks;
	}
	/*public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}*/


}
