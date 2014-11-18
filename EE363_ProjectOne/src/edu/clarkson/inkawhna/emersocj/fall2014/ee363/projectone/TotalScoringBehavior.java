package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;

/**
 * Class used to determine the winner of a full game(left and right hand)
 * @author Cody Emerson
 *
 */
public class TotalScoringBehavior implements GameScoringBehavior {
	
	final String ROCK = "Rock Right Handed Weapon";
	final String PAPER =  "Paper Right Handed Weapon";	
	final String SCISSORS = "Scissors Right Handed Weapon";
	final String LIZARD =  "Lizard Right Handed Weapon";	
	final String SPOCK= "Spock Right Handed Weapon";
	final String POISONOUS = "Poisonous Left Handed Weapon";
	final String INFESTED =  "Infested Left Handed Weapon";	
	final String RADIOACTIVE = "Radioactive Left Handed Weapon";
	
	/**
	 * Contains the logic to select the winner of the game.
	 * returns 1 for player one wins
	 * return 0 for player two wins
	 * returns -1 for a tie.
	 * @param mainGameArray
	 * @return
	 */
	
	public int selectWinner(ArrayList<Weapon> mainGameArray) {
		
		System.out.println("********");
		System.out.println("FROM SELECT WINNER FUNCTION");
		for(int i = 0 ; i<mainGameArray.size(); i++){
			Weapon temp = mainGameArray.get(i);
			System.out.println(temp.attack());
		}
		System.out.println("********");
		
		
		if(mainGameArray.get(0).attack() ==  ROCK){
			if(mainGameArray.get(1).attack() == SCISSORS) return 1;
			else if(mainGameArray.get(1).attack() == LIZARD) return 1;
			else if(mainGameArray.get(1).attack() == SPOCK) return 0;
			else if(mainGameArray.get(1).attack() == PAPER) return 0;
		}
		
		if(mainGameArray.get(0).attack() ==  PAPER){
			if(mainGameArray.get(1).attack() == ROCK) return 1;
			else if(mainGameArray.get(1).attack() == SPOCK) return 1;
			else if(mainGameArray.get(1).attack() == SCISSORS) return 0;
			else if(mainGameArray.get(1).attack() == LIZARD) return 0;
		}
		
		if(mainGameArray.get(0).attack() ==  SCISSORS){
			if(mainGameArray.get(1).attack() == PAPER) return 1;
			else if(mainGameArray.get(1).attack() == LIZARD) return 1;
			else if(mainGameArray.get(1).attack() == SPOCK) return 0;
			else if(mainGameArray.get(1).attack() == ROCK) return 0;
		}
		
		if(mainGameArray.get(0).attack() ==  LIZARD){
			if(mainGameArray.get(1).attack() == SPOCK) return 1;
			else if(mainGameArray.get(1).attack() == LIZARD) return 1;
			else if(mainGameArray.get(1).attack() == SCISSORS) return 0;
			else if(mainGameArray.get(1).attack() == ROCK) return 0;
		}
		
		if(mainGameArray.get(0).attack() ==  SPOCK){
			if(mainGameArray.get(1).attack() == ROCK) return 1;
			else if(mainGameArray.get(1).attack() == SCISSORS) return 1;
			else if(mainGameArray.get(1).attack() == PAPER) return 0;
			else if(mainGameArray.get(1).attack() == LIZARD) return 0;
		}

		
		if(mainGameArray.get(2).attack() ==  POISONOUS){
			if(mainGameArray.get(3).attack() == INFESTED) return 1;
			else if(mainGameArray.get(3).attack() == RADIOACTIVE) return 0;
		}
		
		if(mainGameArray.get(2).attack() ==  INFESTED){
			if(mainGameArray.get(3).attack() == RADIOACTIVE) return 1;
			else if(mainGameArray.get(3).attack() == POISONOUS) return 0;
		}
		
		if(mainGameArray.get(2).attack() ==  RADIOACTIVE){
			if(mainGameArray.get(3).attack() == POISONOUS) return 1;
			else if(mainGameArray.get(3).attack() == INFESTED) return 0;
		}
		return -1;
	}
}

