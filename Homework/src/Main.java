import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);	
		Random r = new Random();
		String playerInput = "";
		String rock = "rock";
		String paper = "paper";
		String scissors = "scissors";
		String opponentInput = null;
		int randomNum = 0;

		
	while(!(playerInput.equalsIgnoreCase("quit")))
	{
		// gets the user input
		System.out.println("Please enter either Rock, Paper, or Scissors");
		System.out.println("Enter quit to stop the game");
		// sets the user input
		playerInput = userInput.nextLine();
		// defines a Random object r

		randomNum = r.nextInt(3);
		//added switch statement for the random number
		switch (randomNum) {
		case 0:
			opponentInput = rock;
			break;
		case 1:
			opponentInput = paper;
			break;
		default:
			opponentInput = scissors;

		}
		
		if (playerInput.equalsIgnoreCase(opponentInput))
			System.out.println("Opponent chooses: " + opponentInput +", ITS A DRAW!");
		else if (playerInput.equalsIgnoreCase(rock) && opponentInput.equalsIgnoreCase(paper))
			System.out.println("Opponent chooses: " + opponentInput +", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase(rock) && opponentInput.equalsIgnoreCase(scissors))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(paper) && opponentInput.equalsIgnoreCase(rock))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(paper) && opponentInput.equalsIgnoreCase(scissors))
			System.out.println("Opponent chooses: " + opponentInput +", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase(scissors) && opponentInput.equalsIgnoreCase(paper))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(scissors) && opponentInput.equalsIgnoreCase(rock))
			System.out.println("Opponent chooses: " + opponentInput + ", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase("quit"))
			System.out.println("Exiting the game!");
		else
			System.out.println("You did not pick rock, paper, or scissor. Please try again");
		}
		userInput.close();
	}

	}

