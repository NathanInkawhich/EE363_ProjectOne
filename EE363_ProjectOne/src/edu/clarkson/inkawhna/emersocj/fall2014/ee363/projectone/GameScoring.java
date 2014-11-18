package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;

/**
 * Contains a game scoring behavior used to select a winner of the game.
 * @author Cody Emerson
 *
 */
public abstract class GameScoring {
	
	GameScoringBehavior gameScoringBehavior;
		
	/**
	 * Selects the winner of a game decided by the gameScoringBehavior
	 * @param weaponArray
	 */
	public void selectWinner(ArrayList<Weapon> weaponArray)
	{
		gameScoringBehavior.selectWinner(weaponArray);
	}

}
