package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private static final String FIZZ_BUZZ = "fizz buzz";

    public String fizzBuzz(Integer number) {
        if (isMultipliedBy3And5(number)) {
        	return FIZZ_BUZZ;
        } else if (isMultipliedBy3(number)) {
        	return FIZZ;
        } else if (isMultipliedBy5(number)) {
        	return BUZZ;
        } else {
        	return String.valueOf(number);
        }
    }
    
    private boolean isMultipliedBy3(int number) {
    	return number % 3 == 0;
    }
    
    private boolean isMultipliedBy5(int number) {
    	return number % 5 == 0;
    }
    
    private boolean isMultipliedBy3And5(int number) {
    	return number % (5 * 3) == 0;
    }

}
