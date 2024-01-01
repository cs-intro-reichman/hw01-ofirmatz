/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		/*
  		# Feedback: Please ensure consistent indentation for better code readability. 
  		Consider using standard indentation, such as four spaces or tabs consistently.
    		Ensure proper indentation for code blocks enclosed with { }.
   		The open and close braces should be aligned with the corresponding control structure or method.
   		Example:
	   	public static void main(String[] args) {
	      		// Code inside the block
	   	}
		*/
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean result = ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
        		System.out.print(a +", "+ b +", "+ c +": " + result);
    


}
}
