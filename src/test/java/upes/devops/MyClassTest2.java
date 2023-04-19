package upes.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest2 {

	@Test
	public void test() {
		MyClass ob = new MyClass ();
		 assertEquals (25, ob.sum(20,5));
		 assertEquals (25, ob.diff(30,5));
		
		
	}

}
