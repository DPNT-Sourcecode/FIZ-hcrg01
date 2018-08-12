package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private static final String DELUXE = "deluxe";
	private static final String FIZZ_BUZZ = "fizz buzz";
	private static final String FIZZ_DELUXE = "fizz deluxe";
	private static final String BUZZ_DELUXE = "buzz deluxe";
	private static final String FIZZ_BUZZ_DELUXE = "fizz buzz deluxe";

    public String fizzBuzz(Integer number) {
    	if(isFizzBuzzDeluxe(number)) {
    		return FIZZ_BUZZ_DELUXE;
    	} else if(isFizzDeluxe(number)) {
    		return FIZZ_DELUXE;
    	} else if(isBuzzDeluxe(number)) {
    		return BUZZ_DELUXE;
    	} else if(isDeluxe(number)) {
    		return DELUXE;
    	} else if (isFizzBuzz(number)) {
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
    	return number % 3 == 0 || contains(number, "3");
    }
    
    private boolean isBuzz(Integer number) {
    	return number % 5 == 0 || contains(number, "5");
    }
    
    private boolean isFizzBuzz(Integer number) {
    	return number % (5 * 3) == 0 || (isFizz(number) && isBuzz(number));
    }
    
    private boolean isFizzDeluxe(Integer number) {
    	return (number % 3 == 0 || contains(number, "3")) && isDeluxe(number);
    }
    
    private boolean isBuzzDeluxe(Integer number) {
    	return (number % 5 == 0 || contains(number, "5")) && isDeluxe(number);
    }
    
    private boolean isDeluxe(Integer number) {
    	return number > 10 && containsSameDigit(number);
    }
    
    private boolean isFizzBuzzDeluxe(Integer number) {
    	return isFizzBuzz(number) && isDeluxe(number);
    }
    
    private boolean containsSameDigit(Integer number) {
    	boolean deluxe = true;
    	String str = String.valueOf(number);
    	char first = str.charAt(0);
    	for(int i = 1; i < str.length(); i++) {
    		if(str.charAt(i) != first) {
    			deluxe = false;
    			break;
    		}
    	}
    	return deluxe;
    }
    
    private boolean contains(Integer number, String numberToFind) {
    	String str = String.valueOf(number);
    	return str.indexOf(numberToFind) > -1 ? true : false;
    }

}
