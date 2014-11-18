package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;

/**
 * Classed used to  select the winner of a left hand only game.
 * Implemented with the strategy pattern.
 * @author Cody Emerson
 *
 */
public class LeftScoringBehavior implements GameScoringBehavior {
	
	final String POISONOUS = "Poisonous Left Handed Weapon";
	final String INFESTED =  "Infested Left Handed Weapon";	
	final String RADIOACTIVE = "Radioactice Left Handed Weapon";
	
	/**
	 * Contains the logic to select a left handed game winner.
	 * Returns 1 when player 1 wins.
	 * Returns 0 when player 2 wins.
	 * Returns -1 when there is a tie
	 * Returns -2 when there is an error
	 * @param ArrayList
	 */
	public int selectWinner(ArrayList<Weapon> weaponArray) {
		
		
		if(weaponArray.get(0).attack().equals(POISONOUS)){
			if(weaponArray.get(1).attack().equals(INFESTED)) return 1;
			else if(weaponArray.get(1).attack().equals(RADIOACTIVE)) return 0;
			else return -1;
		}
		
		if(weaponArray.get(0).attack().equals(INFESTED)){
			if(weaponArray.get(1).attack().equals(RADIOACTIVE)) return 1;
			else if(weaponArray.get(1).attack().equals(POISONOUS)) return 0;
			else return -1;
		}
		
		if(weaponArray.get(0).attack().equals(RADIOACTIVE)){
			if(weaponArray.get(1).attack().equals(POISONOUS)) return 1;
			else if(weaponArray.get(1).attack().equals(INFESTED)) return 0;
			else return -1;
		}
		return -2;
	}
}
