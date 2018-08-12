package befaster.solutions.FIZ;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionTest {

	private FizzBuzzSolution fizzBuzz;
	
	@Before
	public void setup() {
		fizzBuzz = new FizzBuzzSolution();
	}
	
	@Test
	public void fizzBuzzTest() {
		assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
		assertEquals("2", fizzBuzz.fizzBuzz(2));
	}
}
