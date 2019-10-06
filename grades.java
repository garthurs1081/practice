package grade_Ranges_Numbers_Arthurs;

import java.util.Scanner;

public class Grade_Ranges_Numbers_Arthurs {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Grade Value:  Your range is between 0 to 100: ");
		
		char quit;
		double numericValue = (0);
		numericValue = sc.nextDouble();
		
		
		System.out.println("Total Grade =  " + numericValue);
		
		System.out.println("------------------------------------------------------------");
		
		do {
			while (true)
			{
				System.out.println("\nPlease enter numeric grade value :");
				try
				{
				numericValue = Double.parseDouble(sc.next());
						break;
			}
			catch (NumberFormatException ignore)
			{
				System.out.println("Invalid Input");
				
			}
		}
			
			if (numericValue >= 90) {
				System.out.println("\n Grade A - Great Job!");
				
			}
				
			else if (numericValue >= 80) {
				System.out.println("\n Grade B");
				
			}
			
			else if (numericValue >= 70) {
				System.out.println("\n Grade C");
				
			}
			else if(numericValue >= 70) {
				System.out.println("\n Grade F - Better luck next time!");
				
			}
			
			System.out.println("Total Grade =  " + numericValue);
			
			System.out.println("\nWould you like to exit? y for yes, enter any other key to continue");
			quit = sc.next().charAt(0);;
		
		}while(quit != 'y' && quit != 'Y');
	
	
	sc.close();
	
	
	}

}
