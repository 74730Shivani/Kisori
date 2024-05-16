package durga_soft;

public class Test {
	/*static int x=10;

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);
		System.out.println(Test.x);//Best practice to access static  variable with the class name
		System.out.println(x);
		 
	}
	public void m1()
	{
		System.out.println(x);
	}

}*/
	
	static int x =10;
	int y = 20;
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.x = 888;
		t1.y =999;
		Test t2 = new Test();
		//System.out.println(t1.x   t2.y);
				
	}
	
}
