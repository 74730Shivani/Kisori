package durga_soft;

public class Test1 {
/*
	public static void main(String[] args) {
		 int i = 10;
		 for(int j=0;j<=3;j++)
		 {
			i = i+j;
			 
		 }
		 //System.out.println(i+"  "+j);Local variable cannot be access outside the method,block
	}
}*/
	
	/*public static void main(String[] args)
	{
		int x;
		//System.out.println("Hello");
		//System.out.println(x);The local variable x may not have been initialized
	}
}*/
	int[] a = new int[3];
	public static void main(String[] args)
	{
	  Test1 t1 = new Test1();
	  System.out.println(t1.a);
	  System.out.println(t1.a[0]);
	  
	}
}

	
