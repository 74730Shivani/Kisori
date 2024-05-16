package durga_soft;
import java.util.*;
public class Stack_Demo {

	public static void main(String[] args) {
		 Stack s = new Stack();
		 s.push("S");
		 s.push("h");
		 s.push("i");
		 s.push("v");
		 s.push("a");
		 s.push("n");
		 s.push("i");
		 System.out.println(s);
		 s.pop();
		 System.out.println(s);
		System.out.println(s.search("S"));
		
	}

}
