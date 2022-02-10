/*
 * Class: CMSC203 
 * Instructor:  Khandan Monshi
 * Description:lab1
 * Due: 2/14/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Lance Nuique
*/


import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		//making a scanner object that reads from keyboard
		
		Scanner input = new Scanner(System.in);
		
		//loop to keep asking for user input
		//variable for the loop
		String answer = " ";
		
		do
		{
		
			//making a new movie project
			
			Movie newmovie = new Movie();
			
			//asking user to input a new movie
			System.out.println("Enter the title of a movie");
			
			String title = input.next();
			
			//setting the new movie title to be the input by the user
			newmovie.setTitle(title);
			
			//ask the user to enter the rating 
			System.out.println("Enter a rating");
			
			String rating= input.next();
			
			//set the rating for new movie that was inputted
			newmovie.setRating(rating);
			
			//ask user to enter the tickets sold
			System.out.println("Enter the number of tickets sold for this movie");
			int tickets=input.nextInt();
			
			newmovie.setSoldTickets(tickets);
			
			System.out.println(newmovie);
			
			System.out.println("Do you want to enter another movie? (y or n)");
			
			answer=input.next();
			
			
		}while(answer.equalsIgnoreCase("y"));
		
		
		System.out.println("Goodbye");
		
		//closing the scanner
		input.close();
		
		
		
		
		
		
	}

}
