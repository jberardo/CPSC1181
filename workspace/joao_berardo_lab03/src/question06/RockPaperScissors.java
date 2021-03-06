package question06;

import java.util.Scanner;

/**
 *  Rock, Paper and Scissors game.
 *  Two player game. Each player has to choose simultaneously
 *  either paper, rock or scissors.
 *  
 *  Rules of the game:
 *    Rock beats scissors
 *    Paper beats rock
 *    Scissors beats paper
 *    Any other combination: tie
 *  
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-26
 */
public class RockPaperScissors {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// variables
		Scanner input = new Scanner(System.in);
		
		// prompt user for a choice and assign to variable player1
		// input is converted to lower case for comparison between the answers
		System.out.println("Player 1: Choose rock, scissors, or paper:");
		String player1 = input.next().toLowerCase();

		// check is input is valid
		if (!checkInput(player1)) {
			System.out.println("Wrong choice. Try again!");
			// exit the program with error code 1
			System.exit(1);
		}

		// prompt user for a choice and assign to variable player1
		// input is converted to lower case for comparison between the answers
		System.out.println("Player 2: Choose rock, scissors, or paper:");
		String player2 = input.next().toLowerCase();
		
		// check is input is valid
		if (!checkInput(player2)) {
			System.out.println("Wrong choice. Try again!");
			// exit the program with error code 1
			System.exit(1);
		}
		
		// check if we had a winner or if it was a tie
		String winner = getWinner(player1, player2);
		// output
		System.out.println(winner);
	}

	/**
	 * Method that checks/validates user input.
	 * The input must be one of the three strings:
	 *   rock
	 *   paper
	 *   scissors
	 * 
	 * @param input Player's guess.
	 * @return boolean Returns true if input string contains any of the three values. Returns false otherwise.
	 */
	private static boolean checkInput(String input) {
		// check user input
		// return true if it is rock, paper or scissors
		// return false if it is something else
		switch(input) {
			case "rock":
			case "paper":
			case "scissors":
				return true;
			default:
				return false;
		}
	}
	
	/**
	 * Method to check if we have a winner or if it was a tie.
	 * @param player1 Input of player1
	 * @param player2 Input of player2
	 * @return String Returns a string with the winner or a tie.
	 */
	private static String getWinner(String player1, String player2) {
		// if both string are equals, it's a tie
		if (player1.equals(player2)) {
			return "It's a tie!";
		}
		
		// sequence of if statements to check the winner
		// the rules are described in the program documentation
		if (player1.equals("rock") && player2.equals("scissors")) {
			return "Player 1 wins.";
		} else if (player2.equals("rock") && player1.equals("scissors")) {
			return "Player 2 wins.";
		}

		if (player1.equals("paper") && player2.equals("rock")) {
			return "Player 1 wins.";
		} else if (player2.equals("paper") && player1.equals("rock")) {
			return "Player 2 wins.";
		}
		
		if (player1.equals("scissors") && player2.equals("paper")) {
			return "Player 1 wins.";
		} else if (player2.equals("scissors") && player1.equals("paper")) {
			return "Player 2 wins.";
		}		
	
		return "It's a tie!";
	}
}