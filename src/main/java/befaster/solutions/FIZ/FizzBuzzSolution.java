package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private static final String FIZZ_BUZZ = "fizz buzz";

    public String fizzBuzz(Integer number) {
        if (isFizzBuzz(number)) {
        	return FIZZ_BUZZ;
        } else if (isFizz(number)) {
        	return FIZZ;
        } else if (isBuzz(number)) {
        	return BUZZ;
        } else {
        	return String.valueOf(number);
        }
    }
    
    private boolean isFizz(Integer number) {
    	return number % 3 == 0 || contains(number, 3);
    }
    
    private boolean isBuzz(Integer number) {
    	return number % 5 == 0 || contains(number, 5);
    }
    
    private boolean isFizzBuzz(Integer number) {
    	return number % (5 * 3) == 0 || (contains(number, 3) && contains(number, 5));
    }
    
    private boolean contains(Integer number, int numberToFind) {
    	String str = String.valueOf(number);
    	return str.indexOf(numberToFind) > -1 ? true : false;
    }

}
