package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;

/**
 * Classed used to  select the winner of a left hand only game.
 * Implemented with the strategy pattern.
 * @author Cody Emerson
 *
 */
public class LeftGameScoring extends GameScoringBehavior {
	
	final String POISONOUS = "LEFT POISIONOUS";
	final String INFESTED =  "LEFT INFESTED";	
	final String RADIOACTIVE = "LEFT RADIOACTIVE";
	
	@Override
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