/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		 /*
  		# Feedback: Please ensure consistent indentation for better code readability. 
  		Consider using standard indentation, such as four spaces or tabs consistently.
    		Consider using proper spacing and parentheses alignment. 
   		The expression "(max - min) + min" can be clearer with consistent formatting.
		*/
	    int randOne;
	    int randTwo;
	    int randThree;
	    int randMin;
	    int min;
	    int max;
	    min = Integer.parseInt(args[0]);  
        max = Integer.parseInt(args[1]);
	    randOne = (int)(Math.random() * (max - min)+min);
	    randTwo = (int)(Math.random() * (max - min)+min);
	    randThree = (int)(Math.random() * (max - min)+min);
        randMin = Math.min(randOne, Math.min(randTwo,randThree));

		System.out.println(randOne);
		System.out.println(randTwo);
		System.out.println(randThree);
		System.out.println("The minimal generated number was "+ randMin);
	}
}
