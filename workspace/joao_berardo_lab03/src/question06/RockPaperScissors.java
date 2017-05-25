/**
 *  Rock, Paper and Scissors game.
 *  Rock beats scissor
 *  Paper beats rock
 *  Scissors beats paper
 */

package question06;

import java.util.Scanner;

public class RockPaperScissors {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Player 1: Choose rock, scissors, or paper:");
		String player1 = input.next().toLowerCase();
		
		if (!checkInput(player1)) {
			System.out.println("Wrong choice. Try again!");
			System.exit(0);
		}
		
		System.out.println("Player 2: Choose rock, scissors, or paper:");
		String player2 = input.next().toLowerCase();
		
		if (!checkInput(player2)) {
			System.out.println("Wrong choice. Try again!");
			System.exit(0);
		}
		
		String winner = getWinner(player1, player2);
		System.out.println(winner);
	}

	private static boolean checkInput(String input) {
		switch(input) {
			case "rock":
			case "paper":
			case "scissors":
				return true;
			default:
				return false;
		}
	}
	
	private static String getWinner(String player1, String player2) {
		if (player1.equals(player2)) {
			return "It's a tie!";
		}
		
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