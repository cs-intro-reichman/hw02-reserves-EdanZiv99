
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int n = Math.random(); 
		boolean IsBoy = false;
		boolean IsGirl = false;  
		String ans = ""; 
		int sum = 0; 
		while ((IsBoy = false) && (IsGirl = false)) {
		if (n >= 0.5) {
			ans = ans + "b";
			}  else  {
				ans = ans + "g";
			}
			n = 
		}
	}
}
