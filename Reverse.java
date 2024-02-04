/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String reverse ="";
		for (int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i); 
			reverse = reverse + c;
		}
		System.out.println(reverse);
		System.out.println("The middle character is" +" "+ s.charAt(s.length()/2));

	}
}
