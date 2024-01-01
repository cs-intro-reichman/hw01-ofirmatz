/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		/*
  		# feedback
    		Please ensure consistent indentation for better code readability. 
  		Consider using standard indentation, such as four spaces or tabs consistently.
		*/
		int x = Integer.parseInt(args[0]);
        int y;
        y=x%25;
	    x=x/25;
	    System.out.print("Use "+x+" quarters and "+y+" cents");
	}
}
