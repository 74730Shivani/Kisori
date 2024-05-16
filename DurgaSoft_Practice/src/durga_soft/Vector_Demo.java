package durga_soft;
import java.util.*;
public class Vector_Demo {

	public static void main(String[] args) {
		 Vector v = new Vector();
		 System.out.println(v.capacity());
		 for(int i =0;i<=10;i++)
		 {
			 v.addElement(i);
			 
		 }
		 System.out.println(v.capacity());
		 v.addElement("M");
		 System.out.println(v);
	}

}
