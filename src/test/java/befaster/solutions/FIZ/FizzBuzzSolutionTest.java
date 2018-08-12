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
		assertEquals("fizz", fizzBuzz.fizz_buzz(3));
		assertEquals("buzz", fizzBuzz.fizz_buzz(5));
		assertEquals("fizz buzz", fizzBuzz.fizz_buzz(15));
		assertEquals("2", fizzBuzz.fizz_buzz(2));
	}
}
