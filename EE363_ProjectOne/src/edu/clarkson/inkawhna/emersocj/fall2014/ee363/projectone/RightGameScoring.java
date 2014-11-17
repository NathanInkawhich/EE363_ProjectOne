package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;

/**
 * Class used to select the winner of a right hand only game.
 * Implemented with a strategy pattern.
 * @author Cody Emerson
 *
 */
public class RightGameScoring extends GameScoringBehavior {
	
	final String ROCK = "RIGHT ROCK";
	final String PAPER =  "RIGHT PAPER";	
	final String SCISSORS = "RIGHT SCISSORS";
	final String LIZARD =  "RIGHT LIZARD";	
	final String SPOCK= "RIGHT SPOCK";
	

	/**
	 * Selects the winner of a right handed game
	 * returns 1 when player 1 wins
	 * returns 0 whe payer 2 wins
	 * returns -1 for a tie
	 * returns -2 for an error
	 * param mainGameArray
	 */
	@Override
	public int selectWinner(ArrayList<Weapon> mainGameArray) {
		
		
		if(mainGameArray.get(0).attack() ==  ROCK){
			if(mainGameArray.get(1).attack() == SCISSORS) return 1;
			else if(mainGameArray.get(1).attack() == LIZARD) return 1;
			else if(mainGameArray.get(1).attack() == SPOCK) return 0;
			else if(mainGameArray.get(1).attack() == PAPER) return 0;
			else return -1;
		}
		
		if(mainGameArray.get(0).attack() ==  PAPER){
			if(mainGameArray.get(1).attack() == ROCK) return 1;
			else if(mainGameArray.get(1).attack() == SPOCK) return 1;
			else if(mainGameArray.get(1).attack() == SCISSORS) return 0;
			else if(mainGameArray.get(1).attack() == LIZARD) return 0;
			else return -1;
		}
		
		if(mainGameArray.get(0).attack() ==  SCISSORS){
			if(mainGameArray.get(1).attack() == PAPER) return 1;
			else if(mainGameArray.get(1).attack() == LIZARD) return 1;
			else if(mainGameArray.get(1).attack() == SPOCK) return 0;
			else if(mainGameArray.get(1).attack() == ROCK) return 0;
			else return -1;
		}
		
		if(mainGameArray.get(0).attack() ==  LIZARD){
			if(mainGameArray.get(1).attack() == SPOCK) return 1;
			else if(mainGameArray.get(1).attack() == LIZARD) return 1;
			else if(mainGameArray.get(1).attack() == SCISSORS) return 0;
			else if(mainGameArray.get(1).attack() == ROCK) return 0;
			else return -1;
		}
		
		if(mainGameArray.get(0).attack() ==  SPOCK){
			if(mainGameArray.get(1).attack() == ROCK) return 1;
			else if(mainGameArray.get(1).attack() == SCISSORS) return 1;
			else if(mainGameArray.get(1).attack() == PAPER) return 0;
			else if(mainGameArray.get(1).attack() == LIZARD) return 0;
			else return -1;
		}
		return -2;
	}
}
