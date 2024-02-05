/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]); 
		double sumNumberOfChildren = 0;
		int NumberOf2Children = 0;
		int NumberOf3Children = 0;
		int NumberOf4OrMoreChildren = 0;
		
		for (int i = 0 ; i < T ; i++) {
			boolean girl = false;
			boolean boy = false; 
			int count = 0;  
			while (!(girl && boy)){
				double random = Math.random();
				if (random <= 0.5){
				girl = true; 
				System.out.print("g ");
				} else {
					boy = true;
					System.out.print("b ");
				}
				count++; 
			}
			System.out.println();
			sumNumberOfChildren = sumNumberOfChildren + count;

			if (count == 2) { 
				NumberOf2Children++;
			 }
			if (count == 3) { 
				NumberOf3Children++;
			}
			if (count >= 4) { 
				NumberOf4OrMoreChildren++;
			} 
		}
			String mostCommonNumber = ""; 
			if ((NumberOf2Children > NumberOf3Children) && (NumberOf2Children > NumberOf4OrMoreChildren)) {
				mostCommonNumber = "2."; 
				if ((NumberOf3Children > NumberOf2Children) && (NumberOf3Children > NumberOf4OrMoreChildren)) {
					mostCommonNumber = "3."; 
				}
					} else {
				mostCommonNumber = "4 or more.";
					
			}
		

		System.out.println("Average: " + ((double) sumNumberOfChildren / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + NumberOf2Children);
		System.out.println("Number of families with 3 children: " + NumberOf3Children);
		System.out.println("Number of families with 4 or more children: " + NumberOf4OrMoreChildren);
		System.out.println("The most common number of children is " + mostCommonNumber) ;
	}
}	
