package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;


/**
 * Class used to select the winner of a right hand only game.
 * Implemented with a strategy pattern.
 * @author Cody Emerson
 *
 */
public class RightScoringBehavior implements GameScoringBehavior {
	
	final String ROCK = "Rock Right Handed Weapon";
	final String PAPER =  "Paper Right Handed Weapon";	
	final String SCISSORS = "Scissors Right Handed Weapon";
	final String LIZARD =  "Lizard Right Handed Weapon";	
	final String SPOCK= "Spock Rigfht Handed Weapon";
	

	/**
	 * Selects the winner of a right handed game
	 * returns 1 when player 1 wins
	 * returns 0 whe payer 2 wins
	 * returns -1 for a tie
	 * returns -2 for an error
	 * param ArrayList
	 */
	
	 public int selectWinner(ArrayList<Weapon> weaponArray) {
		
		
			if(weaponArray.get(0).attack().equals(ROCK)){
				if (weaponArray.get(1).attack().equals(SCISSORS)) return 1;
				else if(weaponArray.get(1).attack().equals(LIZARD)) return 1;
				else if(weaponArray.get(1).attack().equals(SPOCK)) return 0;
				else if(weaponArray.get(1).attack().equals(PAPER)) return 0;
				else return -1;
			}
			
			if(weaponArray.get(0).attack().equals(PAPER)){
				if (weaponArray.get(1).attack().equals(ROCK)) return 1;
				else if(weaponArray.get(1).attack().equals(SPOCK)) return 1;
				else if(weaponArray.get(1).attack().equals(SCISSORS)) return 0;
				else if(weaponArray.get(1).attack().equals(LIZARD)) return 0;
				else return -1;
			}
			
			if(weaponArray.get(0).attack().equals(SCISSORS)){
				if (weaponArray.get(1).attack().equals(PAPER)) return 1;
				else if(weaponArray.get(1).attack().equals(LIZARD)) return 1;
				else if(weaponArray.get(1).attack().equals(SPOCK)) return 0;
				else if(weaponArray.get(1).attack().equals(ROCK)) return 0;
				else return -1;
			}
			
			if(weaponArray.get(0).attack().equals(LIZARD)){
				if (weaponArray.get(1).attack().equals(SPOCK)) return 1;
				else if(weaponArray.get(1).attack().equals(PAPER)) return 1;
				else if(weaponArray.get(1).attack().equals(SCISSORS)) return 0;
				else if(weaponArray.get(1).attack().equals(ROCK)) return 0;
				else return -1;
			}

			if(weaponArray.get(0).attack().equals(SPOCK)){
				if (weaponArray.get(1).attack().equals(ROCK)) return 1;
				else if(weaponArray.get(1).attack().equals(SCISSORS)) return 1;
				else if(weaponArray.get(1).attack().equals(PAPER)) return 0;
				else if(weaponArray.get(1).attack().equals(LIZARD)) return 0;
				else return -1;
			}
		return -2;
	}
}
