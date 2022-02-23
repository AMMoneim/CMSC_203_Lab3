import java.util.Scanner;

public class RNGDriver {

	public static void main(String[] args) {
		

		int nextGuess;

		boolean match = true;
		RNG r1 = new RNG();
		Scanner input = new Scanner(System.in);
		String choice;
		do {
			int lowGuess = 0;
			int highGuess = 100;
			int randNum = r1.rand();

			System.out.println("Enter your first guess.");

			nextGuess = input.nextInt();
			while (nextGuess != randNum)
			{

				match = r1.inputValidation(nextGuess, lowGuess, highGuess);

				//System.out.println(randNum);
				if (nextGuess < randNum && match == true)
				{
					lowGuess = nextGuess;
					System.out.println("Number of guesses is " + r1.getCount());
					System.out.println("The number you entered is too low.");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);

				} 
				else if (nextGuess > randNum && match == true) {
					highGuess = nextGuess;
					System.out.println("Number of guesses is " + r1.getCount());
					System.out.println("The number you entered is too high.");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);

				}

				nextGuess = input.nextInt();

			}
			System.out.println("Number of guesses is " + r1.getCount());
			System.out.println("Congratulations, you guessed correctly.");

			System.out.println("Do you want to try again? (yes/no)");
			choice = input.next();
			r1.resetCount();
		} 
		while (choice.equalsIgnoreCase("yes"));
		System.out.println("Thank you for playing!!!");
		input.close();
	}

}
/*
 * Class: CMSC203 
 * Instructor:khandan vahabzadeh Monshi
 * Description: Driver class that pulls from constructors
 * Due: 2/22/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Abdelmoneim M. Abdelmoneim 
*/

