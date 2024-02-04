import javax.sql.rowset.spi.SyncResolver;

/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int i = (int)(10 * Math.random());
		int n = i;
		do { 
			n = i; 
			System.out.print(n + " ");
			i = (int)(10 * Math.random()); 
		} while (i >= n); 
		System.out.println();
	}
}
