/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
		/*
  		# Feedback: Please ensure consistent indentation for better code readability. 
  		Consider using standard indentation, such as four spaces or tabs consistently.
    		When constructing strings with variables, consider using (a + " * x + " + b + " = " + c).
		*/
		double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double x;
        x=(c-b)/a;

			System.out.println(a+" * x + "+b+" = "+c);
			System.out.print("x = "+ x);
	}
}
