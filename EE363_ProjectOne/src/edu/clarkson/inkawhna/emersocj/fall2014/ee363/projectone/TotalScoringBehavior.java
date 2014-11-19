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
	 * @param weaponArray
	 * @return
	 */
	
	public int selectWinner(ArrayList<Weapon> weaponArray) {

		if(weaponArray.get(0).attack().equals(ROCK)){
			if (weaponArray.get(1).attack().equals(SCISSORS)) return 1;
			else if(weaponArray.get(1).attack().equals(LIZARD)) return 1;
			else if(weaponArray.get(1).attack().equals(SPOCK)) return 0;
			else if(weaponArray.get(1).attack().equals(PAPER)) return 0;
		}
		
		if(weaponArray.get(0).attack().equals(PAPER)){
			if (weaponArray.get(1).attack().equals(ROCK)) return 1;
			else if(weaponArray.get(1).attack().equals(SPOCK)) return 1;
			else if(weaponArray.get(1).attack().equals(SCISSORS)) return 0;
			else if(weaponArray.get(1).attack().equals(LIZARD)) return 0;
		}
		
		if(weaponArray.get(0).attack().equals(SCISSORS)){
			if (weaponArray.get(1).attack().equals(PAPER)) return 1;
			else if(weaponArray.get(1).attack().equals(LIZARD)) return 1;
			else if(weaponArray.get(1).attack().equals(SPOCK)) return 0;
			else if(weaponArray.get(1).attack().equals(ROCK)) return 0;
		}
		
		if(weaponArray.get(0).attack().equals(LIZARD)){
			if (weaponArray.get(1).attack().equals(SPOCK)) return 1;
			else if(weaponArray.get(1).attack().equals(PAPER)) return 1;
			else if(weaponArray.get(1).attack().equals(SCISSORS)) return 0;
			else if(weaponArray.get(1).attack().equals(ROCK)) return 0;
		}

		if(weaponArray.get(0).attack().equals(SPOCK)){
			if (weaponArray.get(1).attack().equals(ROCK)) return 1;
			else if(weaponArray.get(1).attack().equals(SCISSORS)) return 1;
			else if(weaponArray.get(1).attack().equals(PAPER)) return 0;
			else if(weaponArray.get(1).attack().equals(LIZARD)) return 0;
		}		
		

		if(weaponArray.get(2).attack().equals(POISONOUS)){
			if(weaponArray.get(3).attack().equals(INFESTED)) return 1;
			else if(weaponArray.get(3).attack().equals(RADIOACTIVE)) return 0;
			else return -1;
		}
		
		if(weaponArray.get(2).attack().equals(INFESTED)){
			if(weaponArray.get(3).attack().equals(RADIOACTIVE)) return 1;
			else if(weaponArray.get(3).attack().equals(POISONOUS)) return 0;
			else return -1;
		}
		
		if(weaponArray.get(2).attack().equals(RADIOACTIVE)){
			if(weaponArray.get(3).attack().equals(POISONOUS)) return 1;
			else if(weaponArray.get(3).attack().equals(INFESTED)) return 0;
			else return -1;
		}	
		return -2;
	}
}

