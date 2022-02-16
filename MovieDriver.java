import java.util.Scanner;

public class MovieDriver
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		// Instance of a class-object
		String title;
		String rating;
		String choice = "y";
		int numTickets;
		Movie m1 = new Movie();
		Scanner input = new Scanner(System.in);
		// choice.equalsIgnoreCase("y")
		while (choice.equalsIgnoreCase("y")) 
		{
			System.out.println("Enter your Movie name: ");
			title = input.next();
			m1.setTitle(title);

			System.out.println("Enter your Movie rating: ");
			rating = input.next();
			m1.setRating(rating);

			System.out.println("Enter ticket sold: ");
			numTickets = input.nextInt();
			m1.setSoldTickets(numTickets);

			System.out.println(m1.toString());
			System.out.println("do you to enter another movie Y/N: ");
			choice = input.next();

		}
		System.out.println("Goodbye");
		input.close();

	}

}
