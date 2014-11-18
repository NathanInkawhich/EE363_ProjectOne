package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;

/**
 * Classed used to  select the winner of a left hand only game.
 * Implemented with the strategy pattern.
 * @author Cody Emerson
 *
 */
public class LeftScoringBehavior implements GameScoringBehavior {
	
	final String POISONOUS = "LEFT POISIONOUS";
	final String INFESTED =  "LEFT INFESTED";	
	final String RADIOACTIVE = "LEFT RADIOACTIVE";
	
	/**
	 * Contains the logic to select a left handed game winner.
	 * Returns 1 when player 1 wins.
	 * Returns 0 when player 2 wins.
	 * Returns -1 when there is a tie
	 * Returns -2 when there is an error
	 * @param ArrayList
	 */
	public int selectWinner(ArrayList<Weapon> mainGameArray) {
		
		
		if(mainGameArray.get(0).attack() ==  POISONOUS){
			if(mainGameArray.get(1).attack() == INFESTED) return 1;
			else if(mainGameArray.get(1).attack() == RADIOACTIVE) return 0;
			else return -1;
		}
		
		if(mainGameArray.get(0).attack() ==  INFESTED){
			if(mainGameArray.get(1).attack() == RADIOACTIVE) return 1;
			else if(mainGameArray.get(1).attack() == POISONOUS) return 0;
			else return -1;
		}
		
		if(mainGameArray.get(0).attack() ==  RADIOACTIVE){
			if(mainGameArray.get(1).attack() == POISONOUS) return 1;
			else if(mainGameArray.get(1).attack() == INFESTED) return 0;
			else return -1;
		}
		return -2;
	}
}
