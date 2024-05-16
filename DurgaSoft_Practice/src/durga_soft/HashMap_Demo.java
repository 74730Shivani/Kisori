package durga_soft;
import java.util.*;
public class HashMap_Demo {

	public static void main(String[] args) {
		 HashMap m = new HashMap();
		 m.put("Shivani", 100);
		 m.put("Prachi", 200);
		 m.put("Neha", 300);
		 m.put("Anita", 400);
		 System.out.println(m);
		 System.out.println(m.put("Anita", 500));
		 Set s = m.keySet();//collection
		 System.out.println(s);//[]
		 Collection c = m.values();
		 System.out.println(c);
		 Set s1 = m.entrySet();
		 System.out.println(s1);
		 Iterator itr = s1.iterator();
		 while(itr.hasNext())
		 {
			 Map.Entry m1 =(Map.Entry)itr.next();
			 System.out.println(m1.getKey()+"....."+m1.getValue());
			 if(m1.getKey().equals("Shivani"))
			 {
				 m1.setValue(1000);
			 }
		 }
		 System.out.println(m);
		 
		 

	}

}
