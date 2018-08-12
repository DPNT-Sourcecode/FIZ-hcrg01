package befaster.solutions.HLO;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloTest {

	private HelloSolution hello;
	
	@Before
	public void setup() {
		hello = new HelloSolution();
	}
	
	@Test
	public void helloTest() {
		assertEquals(hello.hello("Fizz"), "Hello, World!");
	}
	
}
