package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;

/**
 * Contains a game scoring behavior used to select a winner of the game.
 * @author Cody Emerson
 *
 */
public  class GameScoring {
	
	GameScoringBehavior gameScoringBehavior;
	
	/**
	 * Sets the behavior of the scoring method.
	 * key = 1 left hand game
	 * key = -1 right hand game
	 * key = other total game
	 * @param key
	 */
	public void setScoringBehavior(int key)
	{
		if(key == 1)gameScoringBehavior = new LeftScoringBehavior();
		else if(key == -1)gameScoringBehavior = new RightScoringBehavior();
		else  gameScoringBehavior = new TotalScoringBehavior();
	}
		
	/**
	 * Selects the winner of a game decided by the gameScoringBehavior
	 * @param weaponArray
	 */
	public int selectWinner(ArrayList<Weapon> weaponArray)
	{
		return gameScoringBehavior.selectWinner(weaponArray);
	}

}
