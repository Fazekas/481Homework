import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//gets the user input
		System.out.println("Please enter either Rock, Paper, or Scissors");
		//sets the user input
		String playerInput = userInput.nextLine();
		//defines a Random object r
		Random r = new Random(3);
		
		String opponentInput = null;
		int randomNum = r.nextInt();
		//determines what the opponent picks
		if (randomNum == 0)
			opponentInput = "rock";
		else if (randomNum == 1)
			opponentInput = "paper";
		else
			opponentInput = "scissor";
		
		
		if(playerInput.equalsIgnoreCase(opponentInput))
			System.out.println("ITS A DRAW!");
		else if(playerInput.equalsIgnoreCase("rock") && opponentInput.equalsIgnoreCase("paper"))
			System.out.println("Opponent Wins!");
		else if(playerInput.equalsIgnoreCase("rock") && opponentInput.equalsIgnoreCase("scissor"))
			System.out.println("Player Wins!");
		else if(playerInput.equalsIgnoreCase("paper") && opponentInput.equalsIgnoreCase("rock"))
			System.out.println("Player Wins!");
		else if(playerInput.equalsIgnoreCase("paper") && opponentInput.equalsIgnoreCase("scissor"))
			System.out.println("Opponent Wins!");
		else if(playerInput.equalsIgnoreCase("scissor") && opponentInput.equalsIgnoreCase("paper"))
			System.out.println("Player Wins!");
		else if(playerInput.equalsIgnoreCase("scissor") && opponentInput.equalsIgnoreCase("rock"))
			System.out.println("Opponent Wins!");
		else
			System.out.println("You did not pick rock, paper, or scissor. Please try again");
		
	}

}
