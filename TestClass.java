
import java.io.*;


interface In1 {
	
	public, static and final
	final int a = 10;

	
	void display();
}


class TestClass implements In1 {
	
	
	public void display(){
	System.out.println("Geek");
	}

	
	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
	}
}
