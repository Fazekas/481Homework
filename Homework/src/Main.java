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
		String spock = "spock";
		String lizard = "lizard";
		String opponentInput = null;
		int randomNum = 0;

		
	while(!(playerInput.equalsIgnoreCase("quit")))
	{
		// gets the user input
		System.out.println("Please enter either Rock, Paper, Scissors, Lizard, or Spock");
		System.out.println("Enter quit to stop the game: ");
		// sets the user input
		playerInput = userInput.nextLine();
		// defines a Random object r

		randomNum = r.nextInt(5);
		//added switch statement for the random number
		switch (randomNum) {
		case 0:
			opponentInput = rock;
			break;
		case 1:
			opponentInput = paper;
			break;
		case 2:
			opponentInput = lizard;
			break;
		case 3:
			opponentInput = spock;
			break;
		default:
			opponentInput = scissors;

		}
		
		//tie between player and opponent
		if (playerInput.equalsIgnoreCase(opponentInput))
			System.out.println("Opponent chooses: " + opponentInput +", ITS A DRAW!");
		//player chooses rock
		else if (playerInput.equalsIgnoreCase(rock) && opponentInput.equalsIgnoreCase(paper))
			System.out.println("Opponent chooses: " + opponentInput +", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase(rock) && opponentInput.equalsIgnoreCase(spock))
			System.out.println("Opponent chooses: " + opponentInput +", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase(rock) && opponentInput.equalsIgnoreCase(scissors))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(rock) && opponentInput.equalsIgnoreCase(lizard))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		//player chooses paper
		else if (playerInput.equalsIgnoreCase(paper) && opponentInput.equalsIgnoreCase(rock))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(paper) && opponentInput.equalsIgnoreCase(spock))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(paper) && opponentInput.equalsIgnoreCase(scissors))
			System.out.println("Opponent chooses: " + opponentInput +", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase(paper) && opponentInput.equalsIgnoreCase(lizard))
			System.out.println("Opponent chooses: " + opponentInput +", Opponent Wins!");
		//player chooses scissors
		else if (playerInput.equalsIgnoreCase(scissors) && opponentInput.equalsIgnoreCase(paper))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(scissors) && opponentInput.equalsIgnoreCase(lizard))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(scissors) && opponentInput.equalsIgnoreCase(rock))
			System.out.println("Opponent chooses: " + opponentInput + ", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase(scissors) && opponentInput.equalsIgnoreCase(spock))
			System.out.println("Opponent chooses: " + opponentInput + ", Opponent Wins!");
		//player chooses lizard
		else if (playerInput.equalsIgnoreCase(lizard) && opponentInput.equalsIgnoreCase(paper))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(lizard) && opponentInput.equalsIgnoreCase(spock))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(lizard) && opponentInput.equalsIgnoreCase(rock))
			System.out.println("Opponent chooses: " + opponentInput + ", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase(lizard) && opponentInput.equalsIgnoreCase(scissors))
			System.out.println("Opponent chooses: " + opponentInput + ", Opponent Wins!");
		//players chooses spock
		else if (playerInput.equalsIgnoreCase(spock) && opponentInput.equalsIgnoreCase(rock))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(spock) && opponentInput.equalsIgnoreCase(scissors))
			System.out.println("Opponent chooses: " + opponentInput +", Player Wins!");
		else if (playerInput.equalsIgnoreCase(spock) && opponentInput.equalsIgnoreCase(paper))
			System.out.println("Opponent chooses: " + opponentInput + ", Opponent Wins!");
		else if (playerInput.equalsIgnoreCase(spock) && opponentInput.equalsIgnoreCase(lizard))
			System.out.println("Opponent chooses: " + opponentInput + ", Opponent Wins!");
		//player quits
		else if (playerInput.equalsIgnoreCase("quit"))
			System.out.println("Exiting the game!");
		else
			System.out.println("You did not pick rock, paper, Lizard, Spock, or scissor. Please try again\n");
		}
		userInput.close();
	}

	}

