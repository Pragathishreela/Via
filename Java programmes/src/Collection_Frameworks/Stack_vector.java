package Collection_Frameworks;
import java.util.Stack;
public class Stack_vector {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push("hi");
		s1.push('a');
		System.out.println(s1);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1);
	}
}
