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
		assertEquals("fizz", fizzBuzz.fizzBuzz(13));
		assertEquals("fizz", fizzBuzz.fizzBuzz(163));
		assertEquals("fizz buzz deluxe", fizzBuzz.fizzBuzz(30));
		assertEquals("fizz fake deluxe", fizzBuzz.fizzBuzz(3));
		assertEquals("buzz fake deluxe", fizzBuzz.fizzBuzz(5));
		assertEquals("fizz buzz fake deluxe", fizzBuzz.fizzBuzz(15));
		assertEquals("fizz buzz fake deluxe", fizzBuzz.fizzBuzz(45));
		assertEquals("fizz buzz", fizzBuzz.fizzBuzz(546));
		assertEquals("fizz fake deluxe", fizzBuzz.fizzBuzz(33));
		assertEquals("fizz", fizzBuzz.fizzBuzz(222));
		assertEquals("fizz", fizzBuzz.fizzBuzz(777));
		assertEquals("2", fizzBuzz.fizzBuzz(2));
	} 
}
