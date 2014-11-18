package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;


/**
 * Class used to select the winner of a right hand only game.
 * Implemented with a strategy pattern.
 * @author Cody Emerson
 *
 */
public class RightScoringBehavior implements GameScoringBehavior {
	
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
	 * param weaponArray
	 */
	
	 public int selectWinner(ArrayList<Weapon> weaponArray) {
		
		
		if(weaponArray.get(0).attack() == ROCK){
			if(weaponArray.get(1).attack() == SCISSORS) return 1;
			else if(weaponArray.get(1).attack() == LIZARD) return 1;
			else if(weaponArray.get(1).attack() == SPOCK) return 0;
			else if(weaponArray.get(1).attack() == PAPER) return 0;
			else return -1;
		}
		
		if(weaponArray.get(0).attack() ==  PAPER){
			if(weaponArray.get(1).attack() == ROCK) return 1;
			else if(weaponArray.get(1).attack() == SPOCK) return 1;
			else if(weaponArray.get(1).attack() == SCISSORS) return 0;
			else if(weaponArray.get(1).attack() == LIZARD) return 0;
			else return -1;
		}
		
		if(weaponArray.get(0).attack() ==  SCISSORS){
			if(weaponArray.get(1).attack() == PAPER) return 1;
			else if(weaponArray.get(1).attack() == LIZARD) return 1;
			else if(weaponArray.get(1).attack() == SPOCK) return 0;
			else if(weaponArray.get(1).attack() == ROCK) return 0;
			else return -1;
		}
		
		if(weaponArray.get(0).attack() ==  LIZARD){
			if(weaponArray.get(1).attack() == SPOCK) return 1;
			else if(weaponArray.get(1).attack() == LIZARD) return 1;
			else if(weaponArray.get(1).attack() == SCISSORS) return 0;
			else if(weaponArray.get(1).attack() == ROCK) return 0;
			else return -1;
		}
		
		if(weaponArray.get(0).attack() ==  SPOCK){
			if(weaponArray.get(1).attack() == ROCK) return 1;
			else if(weaponArray.get(1).attack() == SCISSORS) return 1;
			else if(weaponArray.get(1).attack() == PAPER) return 0;
			else if(weaponArray.get(1).attack() == LIZARD) return 0;
			else return -1;
		}
		return -2;
	}
}
