

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static boolean validMove(String s) {
		s = s.toLowerCase();
		if(s.equals("olserod") || s.equals("knarrevik") || s.equals("melltorp") || s.equals("utespelare") || s.equals("yngvar")) {
			return true;
		}
		return false;
	}
	
	public static boolean validPlay(String s) {
		s = s.toLowerCase();
		if(s.equals("y") || s.equals("n")) {
			return true;
		}
		return false;
	}
	
	public static int getRandomInt() {
		//five possible choices correspond to each possible random number
		int min = 0;
		int max = 5;
		
		int output = (int)(Math.random() * (max - min) + min);
		
		return output;
	}
	
	public static boolean userWins(String user, String comp) {
		if(user.equals(comp)) {
			return false;
		}
		if(user.equals("melltorp") && (comp.equals("utespelare") || comp.equals("olserod"))) {
			return true;
		}
		else if(user.equals("utespelare") && (comp.equals("knarrevik") || comp.equals("yngvar"))) {
			return true;
		}
		else if(user.equals("knarrevik") && (comp.equals("melltorp") || comp.equals("olserod"))) {
			return true;
		}
		else if(user.equals("olserod") && (comp.equals("utespelare") || comp.equals("yngvar"))) {
			return true;
		}
		else if(user.equals("yngvar") && (comp.equals("knarrevik") || comp.equals("melltorp"))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void printRules() {
		System.out.println("During each round, players choose a move, which may be either Olserod, Knarrevik, Utespelare, Yngvar, or Melltorp. The rules are:\r\n" + 
				"\r\n" + 
				"Melltorp beats Utespelare, Olserod\r\n" + 
				"Utespelare beats Knarrevik, Yngvar\r\n" + 
				"Knarrevik beats Melltorp, Olserod\r\n" + 
				"Olserod Beats Yngvar, Utespelare\r\n" + 
				"Yngvar beats Melltorp, Knarrevik\r\n" + 
				"\n" +
				"The computer wins in the event of a tie.");
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		
		String play = "";
		boolean validInput = false;
		
		String userInput = "";
		
		int roundsPlayed = 0;
		int computerWins = 0;
		int playerWins = 0;
		int randInt;
		String computerMove;
		
		//random integer 0-4 correlates to in-game move
		final int MELLTORP = 0;
		final int UTESPELARE = 1;
		final int OLSEROD = 2;
		final int KNARREVIK = 3;
		final int YNGVAR = 4;
		
		printRules();

		
		//handle valid input
		while(!validPlay(play)) {
			System.out.println("Would you like to play a round? Please enter y/n");
			play = scnr.nextLine();
		}
		
		while(play.equals("y")) {
			roundsPlayed++;
			
			play = "";
			userInput = "";
			
			while(!validMove(userInput)) {
				System.out.println("Please enter a move: ");
				userInput = scnr.nextLine();
			}
			System.out.println("Your move is " + userInput);
			randInt = getRandomInt();

			
			if(randInt == MELLTORP) {
				computerMove = ("melltorp");
			}
			else if(randInt == UTESPELARE) {
				computerMove = ("utespelare");
			}
			else if(randInt == OLSEROD) {
				computerMove = ("olserod");
			}
			else if(randInt == KNARREVIK) {
				computerMove = "knarrevik";
			}
			else{
				computerMove = "yngvar";
			}
			
			
			System.out.println("The computer chose: " + computerMove);
			
			if(userWins(userInput, computerMove)) {
				System.out.println("You Win!");
				playerWins++;
			}
			
			else {
				System.out.println("Computer Wins!");
				computerWins++;
			}
			
			
			
			
			play = "";
			while(!validPlay(play)) {
				System.out.println("Would you like to play another round? Please enter y/n");
				play = scnr.nextLine();
			
			}
		
			System.out.println();
		}
		System.out.println("You played " + roundsPlayed + " rounds.");
		System.out.println("The computer won " + computerWins + " time(s).");
		System.out.println("You won " + playerWins + " time(s).");
	}
}
