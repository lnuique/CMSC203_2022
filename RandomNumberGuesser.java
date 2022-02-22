/*
 * Class: CMSC203 
 * Instructor:  Khandan Monshi
 * Description: A random number generator that ask the user to input numbers and gives hints based on the user input
 * Due: 2/21/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Lance Nuique
*/


import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		
		//new scanner thing
		Scanner userInput= new Scanner(System.in);
		//calling the rand class making a new random number
				
		//string variable for userinput to ask if they want to try again
		String decision = "";
		
		//initialize to zero and them incremented to 1
		RNG r1 = new RNG();
		
		
		
		//while loop to get if they want to try again
		
		while(!(decision.equalsIgnoreCase("no")))
			
		{
				//making variables for inputValidation
				int lower=0, upper=100, nextGuess=-1, randNum;

				randNum = RNG.rand();
			
				
				//making the loop so that it keeps asking until the user gets the number
			do {
				
				System.out.println("Enter your guess");
				nextGuess=userInput.nextInt();
				
				System.out.println("Number of guesses is " + RNG.getCount());
				
				
				//making an if statement to have the numbers be put into the inputValidation method to be different 
				
				if (nextGuess>randNum)
				{
					System.out.println("Your guess is too high");
					
					upper=nextGuess;
				}
				
				else if (nextGuess<randNum)
				{
					System.out.println("Your guess is too low");
					
					lower=nextGuess;
					
				}
				
				else if(nextGuess==randNum)
				{
					
					System.out.println("Congratulations you guessed the number correctly");
			
				}
				
				RNG.inputValidation(nextGuess, lower, upper);
				
			}while(randNum!=nextGuess);
			
			RNG.resetCount();
		
			System.out.println("Do you want to try again?(yes or no)");
			decision=userInput.next();
		}
		
		System.out.println("Thanks for playing!");
		
		userInput.close();
		}
		
		
	}


