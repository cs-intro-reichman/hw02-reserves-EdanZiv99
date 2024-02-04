/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
	int n = Integer.parseInt(args[0]); 
	for (int j = 1 ; j <= n ; j++) {
		if (j % 2 == 0) {
			System.out.print(" ");
		}
		for (int i = 1 ; i <= n ; i++) {
			System.out.print("* ");
			if (i == n) {
				System.out.println();				
			}
		}	
	}
}
}