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
		assertEquals("fizz deluxe", fizzBuzz.fizzBuzz(3));
		assertEquals("fizz", fizzBuzz.fizzBuzz(13));
		assertEquals("buzz", fizzBuzz.fizzBuzz(5));
		assertEquals("buzz", fizzBuzz.fizzBuzz(52));
		assertEquals("deluxe", fizzBuzz.fizzBuzz(22));
		assertEquals("fizz buzz", fizzBuzz.fizzBuzz(15));
		assertEquals("fizz buzz", fizzBuzz.fizzBuzz(546));
		assertEquals("fizz fake deluxe", fizzBuzz.fizzBuzz(33));
		assertEquals("fizz deluxe", fizzBuzz.fizzBuzz(222));
		assertEquals("fizz fake deluxe", fizzBuzz.fizzBuzz(777));
		assertEquals("2", fizzBuzz.fizzBuzz(2));
	}
}
