package upes.devops;

import static org.junit.Assert.*;
import upes.devops.MyClass;
import org.junit.Test;

public class MyClassTest {

	@Test
	public void test() {
		MyClass ob = new MyClass ();
		 assertEquals (25, ob.sum(20,5));
		 assertEquals (25, ob.diff(20,5));
		 assertEquals (25, ob.mul(20,5));
		 assertEquals (25, ob.div(20,5));
		 }

}
